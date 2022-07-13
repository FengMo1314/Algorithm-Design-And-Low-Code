package others;

public class PolyTerm implements Comparable<PolyTerm>  {
    public double coefficient;
    public int exponent;

    public PolyTerm(double coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public PolyTerm(PolyTerm pt) {
        this.coefficient = pt.coefficient;
        this.exponent = pt.exponent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp = Double.doubleToLongBits(coefficient);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        result = prime * result + exponent;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        PolyTerm other = (PolyTerm) obj;
        if ((Double.doubleToLongBits(coefficient) != Double.doubleToLongBits(other.coefficient)) || (exponent != other.exponent)) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(PolyTerm o) {
        return this.exponent - o.exponent;
    }

    @Override
    public String toString() {
        String rtn;
        if (coefficient > 0) {
            switch (exponent) {
                case 0:
                    rtn = "+" + coefficient;
                    break;
                case 1:
                    rtn = "+" + coefficient + "x";
                    break;
                default:
                    rtn = "+" + coefficient + "x^" + exponent;
            }

        } else {
            switch (exponent) {
                case 0:
                    rtn = coefficient + "";
                    break;
                case 1:
                    rtn = coefficient + "x";
                    break;
                default:
                    rtn = coefficient + "x^" + exponent;
            }
        }

        return rtn;
    }

}
