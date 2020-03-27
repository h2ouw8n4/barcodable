/*
 * Barcodable.com API
 *
 * Barcodable.com API
 *
 * API version: 1.5.0
 * Contact: support@barcodable.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
)

// NotFound struct for NotFound
type NotFound struct {
	Message *string `json:"message,omitempty"`
	Status *int32 `json:"status,omitempty"`
}

// NewNotFound instantiates a new NotFound object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNotFound() *NotFound {
	this := NotFound{}
	return &this
}

// NewNotFoundWithDefaults instantiates a new NotFound object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNotFoundWithDefaults() *NotFound {
	this := NotFound{}
	return &this
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *NotFound) GetMessage() string {
	if o == nil || o.Message == nil {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *NotFound) GetMessageOk() (*string, bool) {
	if o == nil || o.Message == nil {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *NotFound) HasMessage() bool {
	if o != nil && o.Message != nil {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *NotFound) SetMessage(v string) {
	o.Message = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *NotFound) GetStatus() int32 {
	if o == nil || o.Status == nil {
		var ret int32
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *NotFound) GetStatusOk() (*int32, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *NotFound) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given int32 and assigns it to the Status field.
func (o *NotFound) SetStatus(v int32) {
	o.Status = &v
}

func (o NotFound) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Message != nil {
		toSerialize["message"] = o.Message
	}
	if o.Status != nil {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullableNotFound struct {
	value *NotFound
	isSet bool
}

func (v NullableNotFound) Get() *NotFound {
	return v.value
}

func (v *NullableNotFound) Set(val *NotFound) {
	v.value = val
	v.isSet = true
}

func (v NullableNotFound) IsSet() bool {
	return v.isSet
}

func (v *NullableNotFound) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNotFound(val *NotFound) *NullableNotFound {
	return &NullableNotFound{value: val, isSet: true}
}

func (v NullableNotFound) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNotFound) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}