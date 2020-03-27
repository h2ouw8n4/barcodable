QT += network

HEADERS += \
# Models
    $${PWD}/OAIInline_response_200.h \
    $${PWD}/OAIInline_response_400.h \
    $${PWD}/OAIInvalid_code.h \
    $${PWD}/OAIItem.h \
    $${PWD}/OAINot_found.h \
# APIs
    $${PWD}/OAIProductConversionApi.h \
    $${PWD}/OAIProductLookupApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIEnum.h \
    $${PWD}/OAIHttpFileElement.h

SOURCES += \
# Models
    $${PWD}/OAIInline_response_200.cpp \
    $${PWD}/OAIInline_response_400.cpp \
    $${PWD}/OAIInvalid_code.cpp \
    $${PWD}/OAIItem.cpp \
    $${PWD}/OAINot_found.cpp \
# APIs
    $${PWD}/OAIProductConversionApi.cpp \
    $${PWD}/OAIProductLookupApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp

