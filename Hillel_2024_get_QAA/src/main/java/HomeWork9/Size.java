package HomeWork9;

        public enum Size {
            SMALL("Tshort", 5.6, 7.8),
            MEDIUM("Shorts", 3.5, 7.9),
            LARGE("Dress", 5.6, 8.6);

            public String getName() {
                return name;
            }

            public Double getWidth() {
                return width;
            }

            public Double getLength() {
                return length;
            }

            @Override
            public String toString() {
                return "Size{" +
                        "name='" + name + '\'' +
                        ", width=" + width +
                        ", length=" + length +
                        '}';
            }

            private String name;
            private Double width;
            private Double length;

            private Size(String name, Double width, Double length) {
                this.name = name;
                this.width = width;
                this.length = length;
            }

        }
