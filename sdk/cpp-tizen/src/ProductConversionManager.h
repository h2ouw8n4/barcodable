#ifndef _ProductConversionManager_H_
#define _ProductConversionManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Inline_response_200.h"
#include "Inline_response_400.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ProductConversion ProductConversion
 * \ingroup Operations
 *  @{
 */
class ProductConversionManager {
public:
	ProductConversionManager();
	virtual ~ProductConversionManager();

/*! \brief Convert between UPC, EAN, and ASIN product codes.. *Synchronous*
 *
 * Returns the converted UPC, EAN, and ASIN codes.
 * \param upc_Pipe_ean_Pipe_asin UPC, EAN, or ASIN *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool convertCodeSync(char * accessToken,
	std::string upc_Pipe_ean_Pipe_asin, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData);

/*! \brief Convert between UPC, EAN, and ASIN product codes.. *Asynchronous*
 *
 * Returns the converted UPC, EAN, and ASIN codes.
 * \param upc_Pipe_ean_Pipe_asin UPC, EAN, or ASIN *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool convertCodeAsync(char * accessToken,
	std::string upc_Pipe_ean_Pipe_asin, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0";
	}
};
/** @}*/

}
}
#endif /* ProductConversionManager_H_ */
