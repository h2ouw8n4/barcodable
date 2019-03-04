/*
 * Inline_response_400.h
 *
 * 
 */

#ifndef _Inline_response_400_H_
#define _Inline_response_400_H_


#include <string>
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

class Inline_response_400 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_400();
	Inline_response_400(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_400();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	int getStatus();

	/*! \brief Set 
	 */
	void setStatus(int  status);

private:
	std::string message;
	int status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_400_H_ */
