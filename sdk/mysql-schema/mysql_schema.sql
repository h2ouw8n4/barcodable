/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `inline_response_200` generated from model 'inlineUnderscoreresponseUnderscore200'
--

CREATE TABLE IF NOT EXISTS `inline_response_200` (
  `upcs` JSON DEFAULT NULL COMMENT 'A list of UPCs',
  `eans` JSON DEFAULT NULL COMMENT 'A list of EANs',
  `asins` JSON DEFAULT NULL COMMENT 'A list of ASINs',
  `message` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_400` generated from model 'inlineUnderscoreresponseUnderscore400'
--

CREATE TABLE IF NOT EXISTS `inline_response_400` (
  `message` TEXT DEFAULT NULL,
  `status` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `invalid_code` generated from model 'invalidUnderscorecode'
--

CREATE TABLE IF NOT EXISTS `invalid_code` (
  `message` TEXT DEFAULT NULL,
  `status` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `item` generated from model 'item'
--

CREATE TABLE IF NOT EXISTS `item` (
  `upc` TEXT DEFAULT NULL,
  `ean` TEXT DEFAULT NULL,
  `isbn` TEXT DEFAULT NULL,
  `asin` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL,
  `sku` TEXT DEFAULT NULL,
  `mpn` TEXT DEFAULT NULL,
  `part_number` TEXT DEFAULT NULL,
  `upcs` JSON DEFAULT NULL COMMENT 'A list of matching upc codes.',
  `description` TEXT DEFAULT NULL,
  `brand` TEXT DEFAULT NULL,
  `manufacturer` TEXT DEFAULT NULL,
  `color` TEXT DEFAULT NULL,
  `new_price` DECIMAL(20, 9) DEFAULT NULL,
  `used_price` DECIMAL(20, 9) DEFAULT NULL,
  `currency_code` TEXT DEFAULT NULL,
  `url` TEXT DEFAULT NULL,
  `features` JSON DEFAULT NULL COMMENT 'A list of product feature descriptions.',
  `dimensions` JSON DEFAULT NULL COMMENT 'Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;)',
  `images` JSON DEFAULT NULL COMMENT 'A list product images.',
  `matched_items` JSON DEFAULT NULL COMMENT 'Matched items for this product.',
  `iso_country_codes` JSON DEFAULT NULL COMMENT 'A list of country codes from which this item belongs.',
  `company_name` TEXT DEFAULT NULL COMMENT 'The company name registered to the product&#39;s UPC or EAN.',
  `company_address` TEXT DEFAULT NULL COMMENT 'The company address registered to the product&#39;s UPC or EAN.',
  `categories` JSON DEFAULT NULL COMMENT 'A list of categories for this product.',
  `category_hierarchies` JSON DEFAULT NULL COMMENT 'A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `not_found` generated from model 'notUnderscorefound'
--

CREATE TABLE IF NOT EXISTS `not_found` (
  `message` TEXT DEFAULT NULL,
  `status` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

