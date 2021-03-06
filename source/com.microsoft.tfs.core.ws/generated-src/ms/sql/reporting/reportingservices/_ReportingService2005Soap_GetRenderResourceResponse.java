// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._ReportingService2005Soap_GetRenderResourceResponse;

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
public class _ReportingService2005Soap_GetRenderResourceResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected byte[] result;
    protected String mimeType;

    public _ReportingService2005Soap_GetRenderResourceResponse()
    {
        super();
    }

    public _ReportingService2005Soap_GetRenderResourceResponse(
        final byte[] result,
        final String mimeType)
    {
        // TODO : Call super() instead of setting all fields directly?
        setResult(result);
        setMimeType(mimeType);
    }

    public byte[] getResult()
    {
        return this.result;
    }

    public void setResult(byte[] value)
    {
        this.result = value;
    }

    public String getMimeType()
    {
        return this.mimeType;
    }

    public void setMimeType(String value)
    {
        this.mimeType = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Result"))
                {
                    this.result = XMLConvert.toByteArray(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("MimeType"))
                {
                    this.mimeType = reader.getElementText();
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
