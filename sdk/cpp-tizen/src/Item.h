/*
 * Item.h
 *
 * 
 */

#ifndef _Item_H_
#define _Item_H_


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

class Item : public Object {
public:
	/*! \brief Constructor.
	 */
	Item();
	Item(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Item();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getUpc();

	/*! \brief Set 
	 */
	void setUpc(std::string  upc);
	/*! \brief Get 
	 */
	std::string getEan();

	/*! \brief Set 
	 */
	void setEan(std::string  ean);
	/*! \brief Get 
	 */
	std::string getIsbn();

	/*! \brief Set 
	 */
	void setIsbn(std::string  isbn);
	/*! \brief Get 
	 */
	std::string getAsin();

	/*! \brief Set 
	 */
	void setAsin(std::string  asin);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getSku();

	/*! \brief Set 
	 */
	void setSku(std::string  sku);
	/*! \brief Get 
	 */
	std::string getMpn();

	/*! \brief Set 
	 */
	void setMpn(std::string  mpn);
	/*! \brief Get 
	 */
	std::string getPartNumber();

	/*! \brief Set 
	 */
	void setPartNumber(std::string  part_number);
	/*! \brief Get A list of matching upc codes.
	 */
	std::list<std::string> getUpcs();

	/*! \brief Set A list of matching upc codes.
	 */
	void setUpcs(std::list <std::string> upcs);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	std::string getBrand();

	/*! \brief Set 
	 */
	void setBrand(std::string  brand);
	/*! \brief Get 
	 */
	std::string getManufacturer();

	/*! \brief Set 
	 */
	void setManufacturer(std::string  manufacturer);
	/*! \brief Get 
	 */
	std::string getColor();

	/*! \brief Set 
	 */
	void setColor(std::string  color);
	/*! \brief Get 
	 */
	long long getNewPrice();

	/*! \brief Set 
	 */
	void setNewPrice(long long  new_price);
	/*! \brief Get 
	 */
	long long getUsedPrice();

	/*! \brief Set 
	 */
	void setUsedPrice(long long  used_price);
	/*! \brief Get 
	 */
	std::string getCurrencyCode();

	/*! \brief Set 
	 */
	void setCurrencyCode(std::string  currency_code);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get A list of product feature descriptions.
	 */
	std::list<std::string> getFeatures();

	/*! \brief Set A list of product feature descriptions.
	 */
	void setFeatures(std::list <std::string> features);
	/*! \brief Get Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
	 */
	std::list<std::string> getDimensions();

	/*! \brief Set Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
	 */
	void setDimensions(std::list <std::string> dimensions);
	/*! \brief Get A list product images.
	 */
	std::list<std::string> getImages();

	/*! \brief Set A list product images.
	 */
	void setImages(std::list <std::string> images);
	/*! \brief Get Matched items for this product.
	 */
	std::list<std::string> getMatchedItems();

	/*! \brief Set Matched items for this product.
	 */
	void setMatchedItems(std::list <std::string> matched_items);
	/*! \brief Get A list of country codes from which this item belongs.
	 */
	std::list<std::string> getIsoCountryCodes();

	/*! \brief Set A list of country codes from which this item belongs.
	 */
	void setIsoCountryCodes(std::list <std::string> iso_country_codes);
	/*! \brief Get The company name registered to the product's UPC or EAN.
	 */
	std::string getCompanyName();

	/*! \brief Set The company name registered to the product's UPC or EAN.
	 */
	void setCompanyName(std::string  company_name);
	/*! \brief Get The company address registered to the product's UPC or EAN.
	 */
	std::string getCompanyAddress();

	/*! \brief Set The company address registered to the product's UPC or EAN.
	 */
	void setCompanyAddress(std::string  company_address);
	/*! \brief Get A list of categories for this product.
	 */
	std::list<std::string> getCategories();

	/*! \brief Set A list of categories for this product.
	 */
	void setCategories(std::list <std::string> categories);
	/*! \brief Get A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
	 */
	std::list<std::string> getCategoryHierarchies();

	/*! \brief Set A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
	 */
	void setCategoryHierarchies(std::list <std::string> category_hierarchies);

private:
	std::string upc;
	std::string ean;
	std::string isbn;
	std::string asin;
	std::string title;
	std::string sku;
	std::string mpn;
	std::string part_number;
	std::list <std::string>upcs;
	std::string description;
	std::string brand;
	std::string manufacturer;
	std::string color;
	long long new_price;
	long long used_price;
	std::string currency_code;
	std::string url;
	std::list <std::string>features;
	std::list <std::string>dimensions;
	std::list <std::string>images;
	std::list <std::string>matched_items;
	std::list <std::string>iso_country_codes;
	std::string company_name;
	std::string company_address;
	std::list <std::string>categories;
	std::list <std::string>category_hierarchies;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Item_H_ */
