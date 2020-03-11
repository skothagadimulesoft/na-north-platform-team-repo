# SNMP Extension

This is a prototypal Mule Connector for SNMP. It is bi-directional in that it supports both the sending and reception of SNMP Traps (v1,v2c, v3).

NOTE: This is not a production ready artifact. It is a POC that can be used to test out how SNMP traps can for instance be ingested and then forwarded upstream via a wide array of messaging mechanism (see accompanying Mule project that illustrates the forwarding of SNMP Traps over Kafka).

In order to use this follow the following steps:








...


...


Add this dependency to your application pom.xml

```
<groupId>SNMPConnectorGroup</groupId>
<artifactId>SNMPConnector</artifactId>
<version>1.0.0</version>
<classifier>mule-plugin</classifier>
```
