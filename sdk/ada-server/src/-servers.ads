--  Barcodable.com API
--  Barcodable.com API
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with Swagger.Servers;
with .Models;
with .Skeletons;
package .Servers is
   use .Models;
   type Server_Type is limited new .Skeletons.Server_Type with null record;


   --  Convert between UPC, EAN, and ASIN product codes.
   --  Returns the converted UPC, EAN, and ASIN codes.
   overriding
   procedure Convert_Code
      (Server : in out Server_Type;
       Upc _Pipe ean _Pipe asin : in Swagger.UString;
       Result  : out .Models.InlineResponse200Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Find item by asin code
   --  Returns a single item
   overriding
   procedure Get_Item_By_A_S_I_N
      (Server : in out Server_Type;
       Asin : in Swagger.UString;
       Result  : out .Models.ItemType;
       Context : in out Swagger.Servers.Context_Type);

   --  Find item by UPC code
   --  Returns a single item
   overriding
   procedure Get_Item_By_E_A_N
      (Server : in out Server_Type;
       Ean : in Swagger.UString;
       Result  : out .Models.ItemType;
       Context : in out Swagger.Servers.Context_Type);

   --  Find item by UPC code
   --  Returns a single item
   overriding
   procedure Get_Item_By_U_P_C
      (Server : in out Server_Type;
       Upc : in Swagger.UString;
       Result  : out .Models.ItemType;
       Context : in out Swagger.Servers.Context_Type);

   package Server_Impl is
      new .Skeletons.Shared_Instance (Server_Type);

end .Servers;
