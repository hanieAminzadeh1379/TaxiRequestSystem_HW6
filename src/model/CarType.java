package model;

public enum CarType {

    motorcycle("motorcycle"),
    VANET("Vanet"),
    VAN("Van");
        private String CarType;

        public String getCarType() {
            return CarType;
        }

        CarType(String CarType) {
            this.CarType = CarType;
        }
}
