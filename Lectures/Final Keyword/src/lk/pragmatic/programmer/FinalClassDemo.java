package lk.pragmatic.programmer;

final class A
{
    // methods and fields
}

// The following class is illegal.
class FinalClassDemo //extends A
{
    // COMPILE-ERROR! Can't subclass A
}
