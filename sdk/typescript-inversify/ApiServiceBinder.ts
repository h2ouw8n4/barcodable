import {interfaces} from "inversify";

import { ProductConversionService } from './api/productConversion.service';
import { ProductLookupService } from './api/productLookup.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<ProductConversionService>("ProductConversionService").to(ProductConversionService).inSingletonScope();
        container.bind<ProductLookupService>("ProductLookupService").to(ProductLookupService).inSingletonScope();
    }
}
