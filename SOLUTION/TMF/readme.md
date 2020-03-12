# Salesforce Mulesoft OPEN API Implementation
*Implemented on 10th May 2019*

## Overview
This is a reference implementation of [TMFORUM OPEN API Specs](https://www.tmforum.org/open-apis/).
It is implemented using Salesforce common object models and fields, and Mulesoft for API translation and orchestration.


## TMFORUM OPEN API Implemented Specs
The reference implementation focuses on three TMFORUM Open API Specs:
* [629 Customer Management](https://projects.tmforum.org/wiki/download/attachments/96570225/TMF629_Customer_Management_API_REST_Specification_R18.0.0.pdf?api=v2)
* [681 Communication (Email)](https://projects.tmforum.org/wiki/download/attachments/96570314/TMF681_Communication_API_REST_Specification_R18.0.0.pdf?api=v2)
* [667 Document Management](https://projects.tmforum.org/wiki/download/attachments/90514824/TMF667_Document_Management_API_REST_Specification_R17.0.1.pdf?api=v2)


## Supported Mulesoft APIs and Documentation
The following section documents the support OPEN API exposed via Mulesoft
* [629 Customer Management](https://anypoint.mulesoft.com/exchange/portals/mulesoft-one-platform/9be0b2dd-a5cd-4497-aeb4-1674a4f5a4b5/tmf_customer_mgmt1/)
* [681 Communication (Email)](https://anypoint.mulesoft.com/exchange/portals/mulesoft-one-platform/9be0b2dd-a5cd-4497-aeb4-1674a4f5a4b5/tmf_communication/)
* [667 Document Management](https://anypoint.mulesoft.com/exchange/portals/mulesoft-one-platform/9be0b2dd-a5cd-4497-aeb4-1674a4f5a4b5/tmf_document_management/)
  

## Design & Mapping
The basic design principle is to use OOTB Salesforce object model and fields and use Mulesoft for complex mapping, translation, and orchestration of the various API requests.

![High Level Design](https://github.com/mulesoft-consulting/Mule_Telco/blob/master/DOCUMENTATION/images/Salesforce%20Mulesoft%20-%20OPEN%20API%20Design.png)

All TMFORUM OPEN API resources are mapped to Salesforce Objects and fields.
Mapping of resources can be found here: [OPEN API Resource Mapping to Salesforce](https://github.com/mulesoft-consulting/Mule_Telco/blob/master/DOCUMENTATION/OPENAPI_Salesforce_Mapping.md)


# Installation
This repo holds the basic artefacts to install to your Salesforce and Mulesoft instances - that will get you up and running with the basic configurations.
* [Salesforce Install Notes](https://github.com/mulesoft-consulting/Mule_Telco/blob/master/DOCUMENTATION/Salesforce_Install.md)
* [Mulesoft Install Notes](https://github.com/mulesoft-consulting/Mule_Telco_TMF/blob/master/DOCUMENTATION/Mulesoft_Install_Notes.md)
