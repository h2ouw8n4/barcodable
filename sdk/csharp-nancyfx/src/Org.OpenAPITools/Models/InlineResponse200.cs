using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.mindviserbarcodable1_0_0.Models
{
    /// <summary>
    /// InlineResponse200
    /// </summary>
    public sealed class InlineResponse200:  IEquatable<InlineResponse200>
    { 
        /// <summary>
        /// A list of UPCs
        /// </summary>
        public List<string> Upcs { get; private set; }

        /// <summary>
        /// A list of EANs
        /// </summary>
        public List<string> Eans { get; private set; }

        /// <summary>
        /// A list of ASINs
        /// </summary>
        public List<string> Asins { get; private set; }

        /// <summary>
        /// Message
        /// </summary>
        public string Message { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse200.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse200()
        {
        }

        private InlineResponse200(List<string> Upcs, List<string> Eans, List<string> Asins, string Message)
        {
            
            this.Upcs = Upcs;
            
            this.Eans = Eans;
            
            this.Asins = Asins;
            
            this.Message = Message;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse200.
        /// </summary>
        /// <returns>InlineResponse200Builder</returns>
        public static InlineResponse200Builder Builder()
        {
            return new InlineResponse200Builder();
        }

        /// <summary>
        /// Returns InlineResponse200Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse200Builder</returns>
        public InlineResponse200Builder With()
        {
            return Builder()
                .Upcs(Upcs)
                .Eans(Eans)
                .Asins(Asins)
                .Message(Message);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse200 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse200.
        /// </summary>
        /// <param name="left">Compared (InlineResponse200</param>
        /// <param name="right">Compared (InlineResponse200</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse200 left, InlineResponse200 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse200.
        /// </summary>
        /// <param name="left">Compared (InlineResponse200</param>
        /// <param name="right">Compared (InlineResponse200</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse200 left, InlineResponse200 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse200.
        /// </summary>
        public sealed class InlineResponse200Builder
        {
            private List<string> _Upcs;
            private List<string> _Eans;
            private List<string> _Asins;
            private string _Message;

            internal InlineResponse200Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse200.Upcs property.
            /// </summary>
            /// <param name="value">A list of UPCs</param>
            public InlineResponse200Builder Upcs(List<string> value)
            {
                _Upcs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse200.Eans property.
            /// </summary>
            /// <param name="value">A list of EANs</param>
            public InlineResponse200Builder Eans(List<string> value)
            {
                _Eans = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse200.Asins property.
            /// </summary>
            /// <param name="value">A list of ASINs</param>
            public InlineResponse200Builder Asins(List<string> value)
            {
                _Asins = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse200.Message property.
            /// </summary>
            /// <param name="value">Message</param>
            public InlineResponse200Builder Message(string value)
            {
                _Message = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse200.
            /// </summary>
            /// <returns>InlineResponse200</returns>
            public InlineResponse200 Build()
            {
                Validate();
                return new InlineResponse200(
                    Upcs: _Upcs,
                    Eans: _Eans,
                    Asins: _Asins,
                    Message: _Message
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}