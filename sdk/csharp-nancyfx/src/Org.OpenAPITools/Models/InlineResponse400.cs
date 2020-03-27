using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._magicCashew_barcodable_1_0_0.Models
{
    /// <summary>
    /// InlineResponse400
    /// </summary>
    public sealed class InlineResponse400:  IEquatable<InlineResponse400>
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
        /// Use InlineResponse400.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse400()
        {
        }

        private InlineResponse400(string Message, int? Status)
        {
            
            this.Message = Message;
            
            this.Status = Status;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse400.
        /// </summary>
        /// <returns>InlineResponse400Builder</returns>
        public static InlineResponse400Builder Builder()
        {
            return new InlineResponse400Builder();
        }

        /// <summary>
        /// Returns InlineResponse400Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse400Builder</returns>
        public InlineResponse400Builder With()
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

        public bool Equals(InlineResponse400 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse400.
        /// </summary>
        /// <param name="left">Compared (InlineResponse400</param>
        /// <param name="right">Compared (InlineResponse400</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse400 left, InlineResponse400 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse400.
        /// </summary>
        /// <param name="left">Compared (InlineResponse400</param>
        /// <param name="right">Compared (InlineResponse400</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse400 left, InlineResponse400 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse400.
        /// </summary>
        public sealed class InlineResponse400Builder
        {
            private string _Message;
            private int? _Status;

            internal InlineResponse400Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse400.Message property.
            /// </summary>
            /// <param name="value">Message</param>
            public InlineResponse400Builder Message(string value)
            {
                _Message = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse400.Status property.
            /// </summary>
            /// <param name="value">Status</param>
            public InlineResponse400Builder Status(int? value)
            {
                _Status = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse400.
            /// </summary>
            /// <returns>InlineResponse400</returns>
            public InlineResponse400 Build()
            {
                Validate();
                return new InlineResponse400(
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