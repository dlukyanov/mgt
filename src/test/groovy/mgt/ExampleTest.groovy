package mgt

class ExampleTest
    extends GroovyTestCase
{
    void "test Привет 1"() {
        assert 1==0: "Что-то пошло не так"
    }
    void "test Длинное название - так надо 2"() {
        assert 1==0: "Что-то пошло не так и здесь тоже..."
    }
}
