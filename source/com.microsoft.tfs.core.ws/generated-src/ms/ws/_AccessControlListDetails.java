// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._AccessControlEntryDetails;
import ms.ws._AccessControlListDetails;
import ms.ws._AceExtendedInformation;
import ms.ws._IdentityDescriptor;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AccessControlListDetails
    extends _AccessControlList
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected boolean includeExtendedInfo;

    // Elements
    protected _AccessControlEntryDetails[] accessControlEntries;

    public _AccessControlListDetails()
    {
        super();
    }

    public _AccessControlListDetails(
        final boolean inheritPermissions,
        final String token,
        final boolean includeExtendedInfo,
        final _AccessControlEntryDetails[] accessControlEntries)
    {
        // TODO : Call super() instead of setting all fields directly?
        setInheritPermissions(inheritPermissions);
        setToken(token);
        setIncludeExtendedInfo(includeExtendedInfo);
        setAccessControlEntries(accessControlEntries);
    }

    public boolean isIncludeExtendedInfo()
    {
        return this.includeExtendedInfo;
    }

    public void setIncludeExtendedInfo(final boolean value)
    {
        this.includeExtendedInfo = value;
    }

    public _AccessControlEntryDetails[] getAccessControlEntries()
    {
        return this.accessControlEntries;
    }

    public void setAccessControlEntries(_AccessControlEntryDetails[] value)
    {
        this.accessControlEntries = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Declare our type
        writer.writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "AccessControlListDetails");

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "InheritPermissions",
            this.inheritPermissions);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Token",
            this.token);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "IncludeExtendedInfo",
            this.includeExtendedInfo);

        // Elements
        if (this.accessControlEntries != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("AccessControlEntries");

            for (int iterator0 = 0; iterator0 < this.accessControlEntries.length; iterator0++)
            {
                this.accessControlEntries[iterator0].writeAsElement(
                    writer,
                    "AccessControlEntryDetails");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("InheritPermissions"))
            {
                this.inheritPermissions = XMLConvert.toBoolean(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Token"))
            {
                this.token = attributeValue;
            }
            else if (localName.equalsIgnoreCase("IncludeExtendedInfo"))
            {
                this.includeExtendedInfo = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("AccessControlEntries"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _AccessControlEntryDetails complexObject0 = new _AccessControlEntryDetails();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.accessControlEntries = (_AccessControlEntryDetails[]) list0.toArray(
                                new _AccessControlEntryDetails[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
