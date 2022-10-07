/*
 * This file is generated by jOOQ.
 */
package kiinse.plugin.coldysteps.data.cold.sql.database.tables.records;


import java.util.UUID;

import kiinse.plugin.coldysteps.data.cold.sql.database.tables.Players;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlayersRecord extends UpdatableRecordImpl<PlayersRecord> implements Record4<Integer, UUID, String, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.players.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.players.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.players.UUID</code>.
     */
    public void setUuid(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.players.UUID</code>.
     */
    public UUID getUuid() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.players.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.players.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.players.value</code>.
     */
    public void setValue(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.players.value</code>.
     */
    public Double getValue() {
        return (Double) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, UUID, String, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, UUID, String, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Players.PLAYERS.ID;
    }

    @Override
    public Field<UUID> field2() {
        return Players.PLAYERS.UUID;
    }

    @Override
    public Field<String> field3() {
        return Players.PLAYERS.NAME;
    }

    @Override
    public Field<Double> field4() {
        return Players.PLAYERS.VALUE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getUuid();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Double component4() {
        return getValue();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getUuid();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Double value4() {
        return getValue();
    }

    @Override
    public PlayersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PlayersRecord value2(UUID value) {
        setUuid(value);
        return this;
    }

    @Override
    public PlayersRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public PlayersRecord value4(Double value) {
        setValue(value);
        return this;
    }

    @Override
    public PlayersRecord values(Integer value1, UUID value2, String value3, Double value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlayersRecord
     */
    public PlayersRecord() {
        super(Players.PLAYERS);
    }

    /**
     * Create a detached, initialised PlayersRecord
     */
    public PlayersRecord(Integer id, UUID uuid, String name, Double value) {
        super(Players.PLAYERS);

        setId(id);
        setUuid(uuid);
        setName(name);
        setValue(value);
    }
}
