package org.msgpack.value.impl;

import org.msgpack.core.MessagePacker;
import org.msgpack.value.*;

import java.io.IOException;

/**
* Immutable NilValue implementation
*/
public class NilValueImpl extends AbstractValue implements ImmutableNilValue {

    private static ImmutableNilValue instance = new NilValueImpl();

    public static ImmutableNilValue getInstance() {
        return instance;
    }

    @Override
    public ValueType getValueType() {
        return ValueType.NIL;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Value)) {
            return false;
        }
        return ((Value) o).isNilValue();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "null";
    }

    @Override
    public void writeTo(MessagePacker packer) throws IOException {
        packer.packNil();
    }
    @Override
    public void accept(ValueVisitor visitor) {
        visitor.visitNil();
    }
    @Override
    public NilValue toImmutable() {
        return instance;
    }
}
