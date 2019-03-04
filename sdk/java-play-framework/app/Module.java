import com.google.inject.AbstractModule;

import controllers.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(ProductConversionApiControllerImpInterface.class).to(ProductConversionApiControllerImp.class);
        bind(ProductLookupApiControllerImpInterface.class).to(ProductLookupApiControllerImp.class);
    }
}