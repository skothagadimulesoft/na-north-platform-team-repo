

# Payments Framework

These set of projects illustrate how MuleSoft can be used to cerate a "Payments Hub", that wenabled Open Banking Standards to be
connected to internal Bank systems. The internal Bank architecrure is based on BIAN, and to be more specific the key 
Payment APIs expressed in BIAN.


## Experience APIs

The Experience APIs in this case are defined by the UK standard for Open Banking 
(https://openbanking.atlassian.net/wiki/spaces/DZ/pages/5786479/Payment+Initiation+API+Specification+-+v1.1.0)


## Process APIs

The Process APIs implemented  in this framework are:

* Intra-Banking National (i.e. transfering funds within two differtne accounts of the same (say CITI) Bank)
* Intra-Banking International (i.e. transfering funds between accouns in the same bank but in differetn geographies)
* Inter-Banking National (i.e. transfering funds between two banks in the same nation (say CITI to Wells Fargo) - requires orcehstration with the Central Bank for clearing and settlement)
* Inter-Banking International (i.e. transfering funds accross two diferent banks in two different geographies ( say RBC to CITI))
* Remittances (i.e. transfering funds accross nations over a blockchain protocol)



## System APIs

The System APIs in this case are a variety of Banking Protocol abstractions i.e. SWIFT, ACH etc.


![High Level View](https://exchange2-file-upload-service-kprod.s3.us-east-1.amazonaws.com/55beca47-c1e9-4b5d-a08b-3d6337551bf4-image.png)
