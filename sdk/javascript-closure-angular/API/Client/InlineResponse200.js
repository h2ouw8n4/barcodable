goog.provide('API.Client.inline_response_200');

/**
 * @record
 */
API.Client.InlineResponse200 = function() {}

/**
 * A list of UPCs
 * @type {!Array<!string>}
 * @export
 */
API.Client.InlineResponse200.prototype.upcs;

/**
 * A list of EANs
 * @type {!Array<!string>}
 * @export
 */
API.Client.InlineResponse200.prototype.eans;

/**
 * A list of ASINs
 * @type {!Array<!string>}
 * @export
 */
API.Client.InlineResponse200.prototype.asins;

/**
 * @type {!string}
 * @export
 */
API.Client.InlineResponse200.prototype.message;

