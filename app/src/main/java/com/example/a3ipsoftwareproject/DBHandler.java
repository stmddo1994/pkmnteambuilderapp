package com.example.a3ipsoftwareproject;

import com.example.a3ipsoftwareproject.Pkmn;
import com.example.a3ipsoftwareproject.Moves;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import java.util.Arrays;

public class DBHandler extends SQLiteOpenHelper{

    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Pkmntables";

    // Table Names
    private static final String TABLE_PKMN = "Pkmn";
    private static final String TABLE_MOVES = "Moves";

    // PKMN Table - column names
    private static final String KEY_ID = "Id";
    private static final String KEY_POKEMON = "Pokemon";
    private static final String KEY_BODYSHAPE = "bodyshape";
    private static final String KEY_TYPE1 = "type1";
    private static final String KEY_TYPE2 = "type2";

    // MOVES Table - column names
    private static final String KEY_MOVE = "Move";
    private static final String KEY_MOVE_TYPE = "Type";

    // Table Create Statements
    // PKMN table create statement
    private static final String CREATE_TABLE_PKMN = "CREATE TABLE "
            + TABLE_PKMN + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_POKEMON
            + " TEXT NOT NULL," + KEY_BODYSHAPE + " TEXT NOT NULL," + KEY_TYPE1
            + " TEXT NOT NULL," + KEY_TYPE2 + " TEXT" + ")";

    // Tag table create statement
    private static final String CREATE_TABLE_MOVES = "CREATE TABLE " + TABLE_MOVES
            + "(" + KEY_MOVE + " TEXT PRIMARY KEY," + KEY_MOVE_TYPE + " TEXT NOT NULL"
            + ")";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_PKMN);
        db.execSQL(CREATE_TABLE_MOVES);
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (3,'Venusaur','quadruped','Grass','Poison');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (6,'Charizard','upright','Fire','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (9,'Blastoise','upright','Water',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (24,'Arbok','squiggly','Poison',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (25,'Pikachu','quadruped','Electric',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (36,'Clefable','upright','Fairy',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (51,'Dugtrio','heads','Ground',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (65,'Alakazam','humanoid','Psychic',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (68,'Machamp','humanoid','Fighting',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (85,'Dodrio','legs','Normal','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (94,'Gengar','upright','Ghost','Poison');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (101,'Electrode','ball','Electric',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (110,'Weezing','heads','Poison',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (133,'Eevee','quadruped','Normal',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (134,'Vaporeon','quadruped','Water',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (135,'Jolteon','quadruped','Electric',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (136,'Flareon','quadruped','Fire',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (141,'Kabutops','upright','Rock','Water');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (142,'Aerodactyl','wings','Rock','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (143,'Snorlax','humanoid','Normal',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (157,'Typhlosion','quadruped','Fire',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (166,'Ledian','wings','Bug','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (171,'Lanturn','fish','Water','Electric');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (182,'Bellossom','humanoid','Grass',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (184,'Azumarill','upright','Water','Fairy');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (192,'Sunflora','humanoid','Grass',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (196,'Espeon','quadruped','Psychic',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (197,'Umbreon','quadruped','Dark',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (208,'Steelix','squiggly','Steel','Ground');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (219,'Magcargo','squiggly','Fire','Rock');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (224,'Octillery','tentacles','Water',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (230,'Kingdra','blob','Water','Dragon');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (254,'Sceptile','upright','Grass',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (267,'Beautifly','bug-wings','Bug','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (319,'Sharpedo','fish','Water','Dark');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (330,'Flygon','wings','Ground','Dragon');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (332,'Cacturne','humanoid','Grass','Dark');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (340,'Whiscash','fish','Water','Ground');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (376,'Metagross','heads','Steel','Psychic');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (379,'Registeel','humanoid','Steel',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (405,'Luxray','quadruped','Electric',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (416,'Vespiquen','wings','Bug','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (419,'Floatzel','quadruped','Water',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (421,'Cherrim','legs','Grass',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (429,'Mismagius','ball','Ghost',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (437,'Bronzong','arms','Psychic','Steel');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (448,'Lucario','upright','Fighting','Steel');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (465,'Tangrowth','humanoid','Grass',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (467,'Magmortar','upright','Fire',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (468,'Togekiss','wings','Fairy','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (469,'Yanmega','bug-wings','Bug','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (470,'Leafeon','quadruped','Grass',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (471,'Glaceon','quadruped','Ice',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (476,'Probopass','heads','Rock','Steel');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (503,'Samurott','quadruped','Water',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (505,'Watchog','upright','Normal',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (514,'Simisear','upright','Fire',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (517,'Zoroark','upright','Dark',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (526,'Gigalith','tentacles','Rock',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (558,'Crustle','insect','Bug','Rock');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (560,'Scrafty','upright','Dark','Fighting');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (567,'Archeops','wings','Rock','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (569,'Garbodor','humanoid','Poison',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (589,'Escavalier','arms','Bug','Steel');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (643,'Reshiram','wings','Dragon','Fire');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (644,'Zekrom','upright','Dragon','Electric');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (648,'Meloetta','humanoid','Normal','Psychic');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (700,'Sylveon','quadruped','Fairy',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (713,'Avalugg','quadruped','Ice',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (733,'Toucannon','wings','Normal','Flying');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (738,'Vikavolt','insect','Bug','Electric');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (760,'Bewear','upright','Normal','Fighting');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (807,'Zeraora','humanoid','Electric',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (820,'Greedent','upright','Normal',NULL);");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (826,'Orbeetle','wings','Bug','Psychic');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (834,'Drednaw','quadruped','Water','Rock');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (849,'Toxtricity','upright','Poison','Electric');");
        db.execSQL("INSERT INTO " + TABLE_PKMN + " VALUES (870,'Falinks','heads','Fighting',NULL);");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Aerial Ace','Flying');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Agility','Psychic');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Air Slash','Flying');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Aqua Jet','Water');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Aromatherapy','Grass');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Baby-Doll Eyes','Fairy');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Blaze Kick','Fire');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Brutal Swing','Dark');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Bulk Up','Fighting');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Bullet Punch','Steel');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Calm Mind','Psychic');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Coil','Poison');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Confuse Ray','Ghost');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Curse','Ghost');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Dark Pulse','Dark');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Dazzling Gleam','Fairy');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Dig','Ground');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Double-Edge','Normal');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Dragon Dance','Dragon');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Dragon Pulse','Dragon');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Dragon Rush','Dragon');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Draining Kiss','Fairy');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Dual Chop','Dragon');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Dual Wingbeat','Flying');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Earthquake','Ground');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Electroweb','Electric');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Encore','Normal');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Fairy Wind','Fairy');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Fire Punch','Fire');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Flame Charge','Fire');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Flamethrower','Fire');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Flash Cannon','Steel');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Flip Turn','Water');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Focus Blast','Fighting');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Grass Knot','Grass');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Gyro Ball','Steel');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Head Smash','Rock');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Headbutt','Normal');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Headlong Rush','Ground');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('High Horsepower','Ground');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Hurricane','Flying');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Hydro Pump','Water');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Ice Ball','Ice');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Ice Beam','Ice');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Ice Punch','Ice');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Icy Wind','Ice');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Iron Head','Steel');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Leech Life','Bug');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Low Kick','Fighting');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Mega Kick','Normal');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Mega Punch','Normal');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Nasty Plot','Dark');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Ominous Wind','Ghost');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Play Rough','Fairy');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Poison Jab','Poison');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Power-Up Punch','Fighting');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Psychic','Psychic');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Psycho Cut','Psychic');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Quiver Dance','Bug');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Rain Dance','Water');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Razor Leaf','Grass');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Rest','Psychic');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Rock Slide','Rock');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Rollout','Rock');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Roost','Flying');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Scorching Sands','Ground');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Self-Destruct','Normal');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Shadow Ball','Ghost');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Shadow Punch','Ghost');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Signal Beam','Bug');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Sludge Bomb','Poison');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Sludge Wave','Poison');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Smack Down','Rock');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Stealth Rock','Rock');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Steamroller','Bug');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Steel Wing','Steel');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Storm Throw','Fighting');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Surf','Water');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Thief','Dark');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Throat Chop','Dark');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Thunder Punch','Electric');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Thunder Wave','Electric');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Thunderbolt','Electric');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Toxic','Poison');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Triple Axel','Ice');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Trop Kick','Grass');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Twister','Dragon');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('U-Turn','Bug');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Wild Charge','Electric');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Will-O-Wisp','Fire');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Wood Hammer','Grass');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Wrap','Normal');");
        db.execSQL("INSERT INTO " + TABLE_MOVES + " VALUES ('Zen Headbutt','Psychic');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PKMN);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MOVES);

        // create new tables
        onCreate(db);
    }

    // Create Pokemon
    public void createPkmn(Pkmn Pokemon) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ID, Pokemon.getId());
        values.put(KEY_POKEMON, Pokemon.getPokemon());
        values.put(KEY_BODYSHAPE, Pokemon.getBodytype());
        values.put(KEY_TYPE1, Pokemon.getType1());
        values.put(KEY_TYPE2, Pokemon.getType2());

        // Inserting Row
        db.insert(TABLE_PKMN, null, values);
        db.close(); // Closing database connection
    }

    //Read Pokemon
    @SuppressLint("Range")
    public Pkmn readPkmn(String Pokemon) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + TABLE_PKMN + " WHERE "
                + KEY_POKEMON + " = " + Pokemon;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        Pkmn fPoke = new Pkmn();
        fPoke.setId(c.getInt(c.getColumnIndex(KEY_ID)));
        fPoke.setPokemon((c.getString(c.getColumnIndex(KEY_POKEMON))));
        fPoke.setBodytype(c.getString(c.getColumnIndex(KEY_BODYSHAPE)));
        fPoke.setType1(c.getString(c.getColumnIndex(KEY_TYPE1)));
        fPoke.setType2(c.getString(c.getColumnIndex(KEY_TYPE2)));

        return fPoke;
    }

    //Read all Pokemon
    public List readAllPkmn() {
        List pkmnList = new ArrayList();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_PKMN;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Pkmn aPkmn = new Pkmn();
                aPkmn.setId(Integer.parseInt(cursor.getString(0)));
                aPkmn.setPokemon(cursor.getString(1));
                aPkmn.setBodytype(cursor.getString(2));
                aPkmn.setType1(cursor.getString(3));
                aPkmn.setType2(cursor.getString(4));
                // Adding country to list
                pkmnList.add(aPkmn);
            } while (cursor.moveToNext());
        }

        return pkmnList;
    }

    //Update Pokemon
    public int updatePokemon(Pkmn Pokemon) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_POKEMON, Pokemon.getPokemon());
        values.put(KEY_BODYSHAPE, Pokemon.getBodytype());
        values.put(KEY_TYPE1, Pokemon.getType1());
        values.put(KEY_TYPE2, Pokemon.getType2());

        // updating row
        return db.update(TABLE_PKMN, values, KEY_ID + " = ?",
                new String[] { String.valueOf(Pokemon.getId()) });
    }

    //delete Pokemon
    public void deletePkmn(Pkmn Pokemon) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_PKMN, KEY_ID + " = ?",
                new String[] { String.valueOf(Pokemon.getId()) });
        db.close();
    }

    //delete all Pokemon
    public void deleteAllPkmn() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_PKMN,null,null);
        db.close();
    }

    //create Moves
    public void createMoves(Moves Move) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_MOVE, Move.getMove());
        values.put(KEY_MOVE_TYPE, Move.getType());

        // Inserting Row
        db.insert(TABLE_MOVES, null, values);
        db.close(); // Closing database connection
    }

    //Read Moves
    @SuppressLint("Range")
    public Moves readMove(String Move) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + TABLE_MOVES + " WHERE "
                + KEY_MOVE + " = " + Move;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        Moves fMove = new Moves();
        fMove.setMove(c.getString(c.getColumnIndex(KEY_MOVE)));
        fMove.setType(c.getString(c.getColumnIndex(KEY_TYPE2)));

        return fMove;
    }

    //Read All Moves
    public List readAllMoves() {
        List movesList = new ArrayList();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_MOVES;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Moves aMoves = new Moves();
                aMoves.setMove(cursor.getString(0));
                aMoves.setType(cursor.getString(1));
                // Adding country to list
                movesList.add(aMoves);
            } while (cursor.moveToNext());
        }

        return movesList;
    }

    //Update Moves
    public int updateMoves(Moves Move) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_MOVE_TYPE, Move.getType());

        // updating row
        return db.update(TABLE_MOVES, values, KEY_MOVE + " = ?",
                new String[] { Move.getMove() });
    }

    //Delete Moves
    public void deleteMove(Moves Move) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_MOVES, KEY_MOVE + " = ?",
                new String[] { Move.getMove() });
        db.close();
    }

    //Delete All Moves
    public void deleteAllMoves() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_MOVES,null,null);
        db.close();
    }
}


