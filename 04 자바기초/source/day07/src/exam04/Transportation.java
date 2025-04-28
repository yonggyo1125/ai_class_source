package exam04;

public enum Transportation {
    BUS(1400) {
        @Override
        public int getTotal(int person) {
            return getBaseFare() * person;
        }
    },
    SUBWAY(1450) {
        @Override
        public int getTotal(int person) {
            return getBaseFare() * person;
        }
    },
    TAXI(4500) {
        @Override
        public int getTotal(int person) {
            return getBaseFare() * person;
        }
    },
    AIRPLANE(40000) {
        @Override
        public int getTotal(int person) {
            return getBaseFare() * person;
        }
    };

    private final int baseFare;

    Transportation(int baseFare) {
        this.baseFare = baseFare;
    }

    public int getBaseFare() {
        return baseFare;
    }

    public abstract int getTotal(int person);
}
