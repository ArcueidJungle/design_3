package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {
    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere");
    }

    @Test
    void isThisTetrahedron() {
        Box box = new Box(4, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Tetrahedron");
    }

    @Test
    void isThisDefault() {
        Box box = new Box(1, 8);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Unknown object");
    }

    @Test
    void getAreaCube() {
        Box box = new Box(8, 2);
        double area = box.getArea();
        assertThat(area).isEqualTo(6 * 4);
    }

    @Test
    void getAreaUnknownObject() {
        Box box = new Box(3, 2);
        double area = box.getArea();
        assertThat(area).isEqualTo(0);
    }
}