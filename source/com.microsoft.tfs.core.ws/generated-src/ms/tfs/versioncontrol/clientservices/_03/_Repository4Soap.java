// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.versioncontrol.clientservices._03._Change;
import ms.tfs.versioncontrol.clientservices._03._ChangeRequest;
import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._Changeset;
import ms.tfs.versioncontrol.clientservices._03._CheckinNote;
import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldValue;
import ms.tfs.versioncontrol.clientservices._03._CheckinNotificationInfo;
import ms.tfs.versioncontrol.clientservices._03._CheckinNotificationWorkItemInfo;
import ms.tfs.versioncontrol.clientservices._03._CheckinResult;
import ms.tfs.versioncontrol.clientservices._03._CheckinWorkItemAction;
import ms.tfs.versioncontrol.clientservices._03._Conflict;
import ms.tfs.versioncontrol.clientservices._03._ConflictType;
import ms.tfs.versioncontrol.clientservices._03._DeletedState;
import ms.tfs.versioncontrol.clientservices._03._ExtendedItem;
import ms.tfs.versioncontrol.clientservices._03._Failure;
import ms.tfs.versioncontrol.clientservices._03._GetOperation;
import ms.tfs.versioncontrol.clientservices._03._GetRequest;
import ms.tfs.versioncontrol.clientservices._03._Item;
import ms.tfs.versioncontrol.clientservices._03._ItemSet;
import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LocalItemExclusionSet;
import ms.tfs.versioncontrol.clientservices._03._LocalPendingChange;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._Mapping;
import ms.tfs.versioncontrol.clientservices._03._MergeSource;
import ms.tfs.versioncontrol.clientservices._03._PendingChange;
import ms.tfs.versioncontrol.clientservices._03._PendingSet;
import ms.tfs.versioncontrol.clientservices._03._PendingSetType;
import ms.tfs.versioncontrol.clientservices._03._PolicyFailureInfo;
import ms.tfs.versioncontrol.clientservices._03._PolicyOverrideInfo;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._ReconcileResult;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CheckIn;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CheckInResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CheckInShelveset;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CheckInShelvesetResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CompareLabels;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CompareLabelsResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CreateBranch;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_CreateBranchResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_Get;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_GetResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_GetServerSettings;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_GetServerSettingsResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_Merge;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_MergeResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_PendChanges;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_PendChangesInLocalWorkspace;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_PendChangesInLocalWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_PendChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryChangesForChangeset;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryChangesForChangesetResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryChangesetExtended;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryChangesetExtendedResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryItems;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryItemsExtended;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryItemsExtendedResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryItemsResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryPendingChangeSignature;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryPendingChangeSignatureResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryPendingChangesForWorkspace;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryPendingChangesForWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryPendingSets;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryPendingSetsResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryPendingSetsWithLocalWorkspaces;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryPendingSetsWithLocalWorkspacesResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryShelvedChanges;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryShelvedChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryShelvesets;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryShelvesetsResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryWorkspace;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryWorkspaceItems;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryWorkspaceItemsResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryWorkspaces;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryWorkspacesResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_ReconcileLocalWorkspace;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_ReconcileLocalWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_Resolve;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_ResolveResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_Rollback;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_RollbackResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_SetServerSettings;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_SetServerSettingsResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UndoPendingChanges;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UndoPendingChangesInLocalWorkspace;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UndoPendingChangesInLocalWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UndoPendingChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_Unshelve;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UnshelveResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UpdateLocalVersion;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UpdateLocalVersionResponse;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UpdateShelveset;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_UpdateShelvesetResponse;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._Resolution;
import ms.tfs.versioncontrol.clientservices._03._ServerItemLocalVersionUpdate;
import ms.tfs.versioncontrol.clientservices._03._ServerSettings;
import ms.tfs.versioncontrol.clientservices._03._SeverityType;
import ms.tfs.versioncontrol.clientservices._03._Shelveset;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLink;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;
import ms.tfs.versioncontrol.clientservices._03._Warning;
import ms.tfs.versioncontrol.clientservices._03._WarningType;
import ms.tfs.versioncontrol.clientservices._03._WorkingFolder;
import ms.tfs.versioncontrol.clientservices._03._WorkingFolderType;
import ms.tfs.versioncontrol.clientservices._03._Workspace;
import ms.tfs.versioncontrol.clientservices._03._WorkspaceItem;
import ms.tfs.versioncontrol.clientservices._03._WorkspaceItemSet;

import java.lang.Object;
import java.lang.String;

import java.util.Calendar;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/VersionControl/ClientServices/03}Repository4Soap
 */
public interface _Repository4Soap
{
    public _Repository4Soap_CreateBranchResponse createBranch(
        final String sourcePath,
        final String targetPath,
        final _VersionSpec version,
        final _Changeset info,
        final _CheckinNotificationInfo checkinNotificationInfo,
        final _Mapping[] mappings)
        throws TransportException, SOAPFault;

    public _Repository4Soap_CheckInResponse checkIn(
        final String workspaceName,
        final String ownerName,
        final String[] serverItems,
        final _Changeset info,
        final _CheckinNotificationInfo checkinNotificationInfo,
        final int checkinOptions,
        final boolean deferCheckIn,
        final int checkInTicket)
        throws TransportException, SOAPFault;

    public _Repository4Soap_CheckInShelvesetResponse checkInShelveset(
        final String shelvesetName,
        final String ownerName,
        final String changesetOwner,
        final _CheckinNotificationInfo checkinNotificationInfo,
        final int checkinOptions)
        throws TransportException, SOAPFault;

    public String queryPendingChangeSignature(
        final String workspaceName,
        final String ownerName)
        throws TransportException, SOAPFault;

    public _Repository4Soap_PendChangesInLocalWorkspaceResponse pendChangesInLocalWorkspace(
        final String workspaceName,
        final String ownerName,
        final _ChangeRequest[] changes,
        final int pendChangesOptions,
        final int supportedFeatures,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_QueryPendingSetsWithLocalWorkspacesResponse queryPendingSetsWithLocalWorkspaces(
        final String localWorkspaceName,
        final String localWorkspaceOwner,
        final String queryWorkspaceName,
        final String ownerName,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls,
        final String[] itemPropertyFilters)
        throws TransportException, SOAPFault;

    public _Workspace queryWorkspace(
        final String workspaceName,
        final String ownerName)
        throws TransportException, SOAPFault;

    public _Workspace[] queryWorkspaces(
        final String ownerName,
        final String computer,
        final int permissionsFilter)
        throws TransportException, SOAPFault;

    public _ReconcileResult reconcileLocalWorkspace(
        final String workspaceName,
        final String ownerName,
        final String pendingChangeSignature,
        final _LocalPendingChange[] pendingChanges,
        final _ServerItemLocalVersionUpdate[] localVersionUpdates,
        final boolean clearLocalVersionTable)
        throws TransportException, SOAPFault;

    public _Repository4Soap_UndoPendingChangesInLocalWorkspaceResponse undoPendingChangesInLocalWorkspace(
        final String workspaceName,
        final String ownerName,
        final _ItemSpec[] items,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_UnshelveResponse unshelve(
        final String shelvesetName,
        final String shelvesetOwner,
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final String[] itemPropertyFilters,
        final String[] itemAttrbuteFilters,
        final String[] shelvesetPropertyNameFilters,
        final boolean merge)
        throws TransportException, SOAPFault;

    public void updateLocalVersion(
        final String workspaceName,
        final String ownerName,
        final _ServerItemLocalVersionUpdate[] updates)
        throws TransportException, SOAPFault;

    public _ServerSettings getServerSettings()
        throws TransportException, SOAPFault;

    public void setServerSettings(final _ServerSettings settings)
        throws TransportException, SOAPFault;

    public void updateShelveset(
        final String shelvesetName,
        final String ownerName,
        final _Shelveset updatedShelveset)
        throws TransportException, SOAPFault;

    public _Shelveset[] queryShelvesets(
        final String shelvesetName,
        final String ownerName,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _WorkspaceItemSet[] queryWorkspaceItems(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _DeletedState deletedState,
        final _ItemType itemType,
        final boolean generateDownloadUrls,
        final int options)
        throws TransportException, SOAPFault;

    public _Repository4Soap_QueryPendingSetsResponse queryPendingSets(
        final String localWorkspaceName,
        final String localWorkspaceOwner,
        final String queryWorkspaceName,
        final String ownerName,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls,
        final String[] itemPropertyFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_QueryPendingChangesForWorkspaceResponse queryPendingChangesForWorkspace(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls,
        final int pageSize,
        final String lastChange,
        final boolean includeMergeInfo,
        final String[] itemPropertyFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_QueryShelvedChangesResponse queryShelvedChanges(
        final String localWorkspaceName,
        final String localWorkspaceOwner,
        final String shelvesetName,
        final String ownerName,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls,
        final String[] itemPropertyFilters)
        throws TransportException, SOAPFault;

    public _ExtendedItem[][] queryItemsExtended(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _DeletedState deletedState,
        final _ItemType itemType,
        final int options,
        final String[] itemPropertyFilters)
        throws TransportException, SOAPFault;

    public _ItemSet[] queryItems(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _VersionSpec version,
        final _DeletedState deletedState,
        final _ItemType itemType,
        final boolean generateDownloadUrls,
        final int options,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_ResolveResponse resolve(
        final String workspaceName,
        final String ownerName,
        final int conflictId,
        final _Resolution resolution,
        final String newPath,
        final int encoding,
        final _LockLevel lockLevel,
        final _PropertyValue[] newProperties,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_PendChangesResponse pendChanges(
        final String workspaceName,
        final String ownerName,
        final _ChangeRequest[] changes,
        final int pendChangesOptions,
        final int supportedFeatures,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_MergeResponse merge(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec source,
        final _ItemSpec target,
        final _VersionSpec from,
        final _VersionSpec to,
        final _LockLevel lockLevel,
        final int optionsEx,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_RollbackResponse rollback(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _VersionSpec itemVersion,
        final _VersionSpec from,
        final _VersionSpec to,
        final int rollbackOptions,
        final _LockLevel lockLevel,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _Repository4Soap_UndoPendingChangesResponse undoPendingChanges(
        final String workspaceName,
        final String ownerName,
        final _ItemSpec[] items,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _GetOperation[][] get(
        final String workspaceName,
        final String ownerName,
        final _GetRequest[] requests,
        final int maxResults,
        final int options,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
        throws TransportException, SOAPFault;

    public _Change[] queryChangesForChangeset(
        final int changesetId,
        final boolean generateDownloadUrls,
        final int pageSize,
        final _ItemSpec lastItem,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters,
        final boolean includeMergeSourceInfo)
        throws TransportException, SOAPFault;

    public _Changeset queryChangesetExtended(
        final int changesetId,
        final boolean includeChanges,
        final boolean generateDownloadUrls,
        final String[] changesetPropertyFilters,
        final String[] itemAttributeFilters,
        final String[] itemPropertyFilters)
        throws TransportException, SOAPFault;

    public _Changeset[] compareLabels(
        final String startLabelName,
        final String startLabelScope,
        final String endLabelName,
        final String endLabelScope,
        final int minChangeSet,
        final int maxCount)
        throws TransportException, SOAPFault;
}
