// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.client.common.commands.vc;

import java.text.MessageFormat;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.microsoft.tfs.client.common.Messages;
import com.microsoft.tfs.client.common.commands.TFSConnectedCommand;
import com.microsoft.tfs.core.checkinpolicies.PolicyDefinition;
import com.microsoft.tfs.core.clients.versioncontrol.VersionControlClient;
import com.microsoft.tfs.util.Check;
import com.microsoft.tfs.util.LocaleUtil;

public class SetCheckinPoliciesCommand extends TFSConnectedCommand {
    private final VersionControlClient vcClient;
    private final String teamProjectServerPath;
    private final PolicyDefinition[] definitions;

    public SetCheckinPoliciesCommand(
        final VersionControlClient vcClient,
        final String teamProjectServerPath,
        final PolicyDefinition[] definitions) {
        Check.notNull(vcClient, "vcClient"); //$NON-NLS-1$
        Check.notNullOrEmpty(teamProjectServerPath, "teamProjectServerPath"); //$NON-NLS-1$
        Check.notNull(definitions, "definitions"); //$NON-NLS-1$

        this.vcClient = vcClient;
        this.teamProjectServerPath = teamProjectServerPath;
        this.definitions = definitions;

        setConnection(vcClient.getConnection());
    }

    @Override
    public String getName() {
        final String messageFormat = Messages.getString("SetCheckinPoliciesCommand.CommandTextFormat"); //$NON-NLS-1$
        return MessageFormat.format(messageFormat, teamProjectServerPath);
    }

    @Override
    public String getErrorDescription() {
        return (Messages.getString("SetCheckinPoliciesCommand.ErrorText")); //$NON-NLS-1$
    }

    @Override
    public String getLoggingDescription() {
        final String messageFormat = Messages.getString("SetCheckinPoliciesCommand.CommandTextFormat", LocaleUtil.ROOT); //$NON-NLS-1$
        return MessageFormat.format(messageFormat, teamProjectServerPath);
    }

    @Override
    protected IStatus doRun(final IProgressMonitor progressMonitor) throws Exception {
        final String messageFormat = Messages.getString("SetCheckinPoliciesCommand.ProgressTextFormat"); //$NON-NLS-1$
        final String message = MessageFormat.format(messageFormat, teamProjectServerPath);
        progressMonitor.beginTask(message, IProgressMonitor.UNKNOWN);

        vcClient.setCheckinPolicies(teamProjectServerPath, definitions);

        return Status.OK_STATUS;
    }
}