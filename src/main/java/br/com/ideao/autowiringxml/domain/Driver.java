package br.com.ideao.autowiringxml.domain;

public class Driver {

    private License license;

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "license=" + license +
                '}';
    }
}
