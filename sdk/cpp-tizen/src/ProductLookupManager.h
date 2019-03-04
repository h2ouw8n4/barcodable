#ifndef _ProductLookupManager_H_
#define _ProductLookupManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Invalid_code.h"
#include "Item.h"
#include "Not_found.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ProductLookup ProductLookup
 * \ingroup Operations
 *  @{
 */
class ProductLookupManager {
public:
	ProductLookupManager();
	virtual ~ProductLookupManager();

/*! \brief Find item by asin code. *Synchronous*
 *
 * Returns a single item
 * \param asin ASIN code of item to return *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getItemByASINSync(char * accessToken,
	std::string asin, 
	void(* handler)(Item, Error, void* )
	, void* userData);

/*! \brief Find item by asin code. *Asynchronous*
 *
 * Returns a single item
 * \param asin ASIN code of item to return *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getItemByASINAsync(char * accessToken,
	std::string asin, 
	void(* handler)(Item, Error, void* )
	, void* userData);


/*! \brief Find item by UPC code. *Synchronous*
 *
 * Returns a single item
 * \param ean EAN code of item to return *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getItemByEANSync(char * accessToken,
	std::string ean, 
	void(* handler)(Item, Error, void* )
	, void* userData);

/*! \brief Find item by UPC code. *Asynchronous*
 *
 * Returns a single item
 * \param ean EAN code of item to return *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getItemByEANAsync(char * accessToken,
	std::string ean, 
	void(* handler)(Item, Error, void* )
	, void* userData);


/*! \brief Find item by UPC code. *Synchronous*
 *
 * Returns a single item
 * \param upc UPC code of item to return *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getItemByUPCSync(char * accessToken,
	std::string upc, 
	void(* handler)(Item, Error, void* )
	, void* userData);

/*! \brief Find item by UPC code. *Asynchronous*
 *
 * Returns a single item
 * \param upc UPC code of item to return *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getItemByUPCAsync(char * accessToken,
	std::string upc, 
	void(* handler)(Item, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0";
	}
};
/** @}*/

}
}
#endif /* ProductLookupManager_H_ */
