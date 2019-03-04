/**
* Barcodable.com API
* Barcodable.com API
*
* OpenAPI spec version: 1.5.0
* Contact: support@barcodable.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "Not_found.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

Not_found::Not_found()
{
    m_Message = "";
    m_MessageIsSet = false;
    m_Status = 0;
    m_StatusIsSet = false;
    
}

Not_found::~Not_found()
{
}

void Not_found::validate()
{
    // TODO: implement validation
}

nlohmann::json Not_found::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_MessageIsSet)
    {
        val["message"] = ModelBase::toJson(m_Message);
    }
    if(m_StatusIsSet)
    {
        val["status"] = m_Status;
    }
    

    return val;
}

void Not_found::fromJson(const nlohmann::json& val)
{
    if(val.find("message") != val.end())
    {
        setMessage(val.at("message"));
    }
    if(val.find("status") != val.end())
    {
        setStatus(val.at("status"));
    }
    
}


std::string Not_found::getMessage() const
{
    return m_Message;
}
void Not_found::setMessage(std::string const& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool Not_found::messageIsSet() const
{
    return m_MessageIsSet;
}
void Not_found::unsetMessage()
{
    m_MessageIsSet = false;
}
int32_t Not_found::getStatus() const
{
    return m_Status;
}
void Not_found::setStatus(int32_t const value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool Not_found::statusIsSet() const
{
    return m_StatusIsSet;
}
void Not_found::unsetStatus()
{
    m_StatusIsSet = false;
}

}
}
}
}

