# Documentation for Barcodable.com API 1.5.0 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `openapi-generator`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Barcodable.com API Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to https://virtserver.swaggerhub.comhttps://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0

### ProductConversionManager
Method | HTTP request | Description
------------- | ------------- | -------------
*convertCodeSync* | *GET* /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes..
*convertCodeASync* | *GET* /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes..

### ProductLookupManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getItemByASINSync* | *GET* /api/v1/asin/{asin} | Find item by asin code.
*getItemByASINASync* | *GET* /api/v1/asin/{asin} | Find item by asin code.
*getItemByEANSync* | *GET* /api/v1/ean/{ean} | Find item by UPC code.
*getItemByEANASync* | *GET* /api/v1/ean/{ean} | Find item by UPC code.
*getItemByUPCSync* | *GET* /api/v1/upc/{upc} | Find item by UPC code.
*getItemByUPCASync* | *GET* /api/v1/upc/{upc} | Find item by UPC code.


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *Inline_response_200* | 
 *Inline_response_400* | 
 *Invalid_code* | 
 *Item* | 
 *Not_found* | 

