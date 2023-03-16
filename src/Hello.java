public class Hello {
    private static final String ENDING = "!";
    private static final String GREETING = "Hallo, ";
    private static final String WORD_DELIMITERS = " ";
    private static final String DEFAULT_TARGET = "Welt";

    public static void main(final String[] args) throws Exception {
        final Hello hello = new Hello(args);
        System.out.println(hello);
    }

    private final String greeting;

    public Hello(final String[] args) {
        final String target = (null != args && args.length > 0) ? String.join(WORD_DELIMITERS, args) : DEFAULT_TARGET;
        final StringBuilder sb = new StringBuilder(GREETING)
                .append(target)
                .append(ENDING);
        greeting = sb.toString();
    }

    private Hello(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return greeting;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((greeting == null) ? 0 : greeting.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hello other = (Hello) obj;
        if (greeting == null) {
            // greeting should never be able to be null, but, just in case...
            if (other.greeting != null)
                return false;
        } else if (!greeting.equals(other.greeting))
            return false;
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Hello(greeting);
    }

}
