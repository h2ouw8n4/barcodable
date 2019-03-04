/*
 * Inline_response_200.h
 *
 * 
 */

#ifndef _Inline_response_200_H_
#define _Inline_response_200_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Inline_response_200 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200();
	Inline_response_200(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of UPCs
	 */
	std::list<std::string> getUpcs();

	/*! \brief Set A list of UPCs
	 */
	void setUpcs(std::list <std::string> upcs);
	/*! \brief Get A list of EANs
	 */
	std::list<std::string> getEans();

	/*! \brief Set A list of EANs
	 */
	void setEans(std::list <std::string> eans);
	/*! \brief Get A list of ASINs
	 */
	std::list<std::string> getAsins();

	/*! \brief Set A list of ASINs
	 */
	void setAsins(std::list <std::string> asins);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);

private:
	std::list <std::string>upcs;
	std::list <std::string>eans;
	std::list <std::string>asins;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_H_ */
