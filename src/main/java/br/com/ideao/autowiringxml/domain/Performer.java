package br.com.ideao.autowiringxml.domain;

public class Performer {

    private Instrument instrument;

    public Performer(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Performer{" +
                "instrument=" + instrument +
                '}';
    }
}
