package com.raizlabs.android.dbflow.structure.listener;

import android.database.sqlite.SQLiteStatement;

import com.raizlabs.android.dbflow.structure.Model;

/**
 * Description: Marks a {@link com.raizlabs.android.dbflow.structure.Model} as suscribing to
 * the {@link android.database.sqlite.SQLiteStatement} that is used to {@link com.raizlabs.android.dbflow.structure.Model#insert(boolean)}
 * a model into the DB.
 */
public interface SQLiteStatementListener {

    /**
     * Called at the end of {@link com.raizlabs.android.dbflow.structure.ModelAdapter#bindToStatement(android.database.sqlite.SQLiteStatement, com.raizlabs.android.dbflow.structure.Model)}
     * Perform a custom manipulation of the statement as willed.
     *
     * @param sqLiteStatement The insert statement from the {@link com.raizlabs.android.dbflow.structure.ModelAdapter}
     */
    public void onBindToStatement(SQLiteStatement sqLiteStatement);
}
