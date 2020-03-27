using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._magicCashew_barcodable_1_0_0.Models
{
    /// <summary>
    /// InvalidCode
    /// </summary>
    public sealed class InvalidCode:  IEquatable<InvalidCode>
    { 
        /// <summary>
        /// Message
        /// </summary>
        public string Message { get; private set; }

        /// <summary>
        /// Status
        /// </summary>
        public int? Status { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InvalidCode.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InvalidCode()
        {
        }

        private InvalidCode(string Message, int? Status)
        {
            
            this.Message = Message;
            
            this.Status = Status;
            
        }

        /// <summary>
        /// Returns builder of InvalidCode.
        /// </summary>
        /// <returns>InvalidCodeBuilder</returns>
        public static InvalidCodeBuilder Builder()
        {
            return new InvalidCodeBuilder();
        }

        /// <summary>
        /// Returns InvalidCodeBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InvalidCodeBuilder</returns>
        public InvalidCodeBuilder With()
        {
            return Builder()
                .Message(Message)
                .Status(Status);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InvalidCode other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InvalidCode.
        /// </summary>
        /// <param name="left">Compared (InvalidCode</param>
        /// <param name="right">Compared (InvalidCode</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InvalidCode left, InvalidCode right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InvalidCode.
        /// </summary>
        /// <param name="left">Compared (InvalidCode</param>
        /// <param name="right">Compared (InvalidCode</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InvalidCode left, InvalidCode right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InvalidCode.
        /// </summary>
        public sealed class InvalidCodeBuilder
        {
            private string _Message;
            private int? _Status;

            internal InvalidCodeBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InvalidCode.Message property.
            /// </summary>
            /// <param name="value">Message</param>
            public InvalidCodeBuilder Message(string value)
            {
                _Message = value;
                return this;
            }

            /// <summary>
            /// Sets value for InvalidCode.Status property.
            /// </summary>
            /// <param name="value">Status</param>
            public InvalidCodeBuilder Status(int? value)
            {
                _Status = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InvalidCode.
            /// </summary>
            /// <returns>InvalidCode</returns>
            public InvalidCode Build()
            {
                Validate();
                return new InvalidCode(
                    Message: _Message,
                    Status: _Status
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}