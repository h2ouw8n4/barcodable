using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.magicCashewbarcodable1_0_0.Models
{
    /// <summary>
    /// NotFound
    /// </summary>
    public sealed class NotFound:  IEquatable<NotFound>
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
        /// Use NotFound.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public NotFound()
        {
        }

        private NotFound(string Message, int? Status)
        {
            
            this.Message = Message;
            
            this.Status = Status;
            
        }

        /// <summary>
        /// Returns builder of NotFound.
        /// </summary>
        /// <returns>NotFoundBuilder</returns>
        public static NotFoundBuilder Builder()
        {
            return new NotFoundBuilder();
        }

        /// <summary>
        /// Returns NotFoundBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>NotFoundBuilder</returns>
        public NotFoundBuilder With()
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

        public bool Equals(NotFound other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (NotFound.
        /// </summary>
        /// <param name="left">Compared (NotFound</param>
        /// <param name="right">Compared (NotFound</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (NotFound left, NotFound right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (NotFound.
        /// </summary>
        /// <param name="left">Compared (NotFound</param>
        /// <param name="right">Compared (NotFound</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (NotFound left, NotFound right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of NotFound.
        /// </summary>
        public sealed class NotFoundBuilder
        {
            private string _Message;
            private int? _Status;

            internal NotFoundBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for NotFound.Message property.
            /// </summary>
            /// <param name="value">Message</param>
            public NotFoundBuilder Message(string value)
            {
                _Message = value;
                return this;
            }

            /// <summary>
            /// Sets value for NotFound.Status property.
            /// </summary>
            /// <param name="value">Status</param>
            public NotFoundBuilder Status(int? value)
            {
                _Status = value;
                return this;
            }


            /// <summary>
            /// Builds instance of NotFound.
            /// </summary>
            /// <returns>NotFound</returns>
            public NotFound Build()
            {
                Validate();
                return new NotFound(
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