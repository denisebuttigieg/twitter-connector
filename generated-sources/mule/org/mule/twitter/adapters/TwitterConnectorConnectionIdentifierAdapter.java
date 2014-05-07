
package org.mule.twitter.adapters;

import javax.annotation.Generated;
import org.mule.twitter.TwitterConnector;
import org.mule.twitter.connection.Connection;


/**
 * A <code>TwitterConnectorConnectionIdentifierAdapter</code> is a wrapper around {@link TwitterConnector } that implements {@link org.mule.devkit.dynamic.api.helper.Connection} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-04-21T01:59:11-05:00", comments = "Build UNKNOWN_BUILDNUMBER")
public class TwitterConnectorConnectionIdentifierAdapter
    extends TwitterConnectorProcessAdapter
    implements Connection
{


    public String getConnectionIdentifier() {
        return super.getConnectionIdentifier();
    }

}