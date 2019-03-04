/*
 * Invalid_code.h
 *
 * 
 */

#ifndef _Invalid_code_H_
#define _Invalid_code_H_


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

class Invalid_code : public Object {
public:
	/*! \brief Constructor.
	 */
	Invalid_code();
	Invalid_code(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Invalid_code();

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

#endif /* _Invalid_code_H_ */
