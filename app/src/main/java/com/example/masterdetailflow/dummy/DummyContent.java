package com.example.masterdetailflow.dummy;

import com.example.masterdetailflow.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<>();

    static {
        // Add items.
        String detailsOne = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        String detailsTwo = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        addItem(new DummyItem(
                "1",
                "Appetizing Apple",
                detailsOne,
                R.drawable.apetizing_apple));
        addItem(new DummyItem(
                "2",
                "Beautiful Beets",
                detailsTwo,
                R.drawable.beautiful_beets));
        addItem(new DummyItem(
                "3",
                "Carefree Cake",
                detailsOne,
                R.drawable.carefree_cake));
        addItem(new DummyItem(
                "4",
                "Powerful Pickel",
                detailsTwo,
                R.drawable.powerful_pickle));
        addItem(new DummyItem(
                "5",
                "Pretty Pear",
                detailsOne,
                R.drawable.pretty_pear));
        addItem(new DummyItem(
                "6",
                "Shy Sprouts",
                detailsTwo,
                R.drawable.shy_sprouts));
        addItem(new DummyItem(
                "7",
                "Strong Spinach",
                detailsOne,
                R.drawable.strong_spinach));
        addItem(new DummyItem(
                "8",
                "Yummy Yam",
                detailsTwo,
                R.drawable.yummy_yam));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;         // Recipe ID
        public String content;    // Recipe Name
        public String details;    // Recipe Details
        public int recipeImg;     // Recipe Image

        public DummyItem(String idNum, String name, String ingredients, int image) {
            this.id = idNum;
            this.content = name;
            this.details = ingredients;
            this.recipeImg = image;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}