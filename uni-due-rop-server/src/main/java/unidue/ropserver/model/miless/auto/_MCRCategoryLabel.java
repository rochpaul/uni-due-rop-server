package unidue.ropserver.model.miless.auto;

import org.apache.cayenne.CayenneDataObject;

import unidue.ropserver.model.miless.MCRCategory;

/**
 * Class _MCRCategoryLabel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MCRCategoryLabel extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String LANG_PROPERTY = "lang";
    public static final String TEXT_PROPERTY = "text";
    public static final String CATEGORY_PROPERTY = "category";

    public static final String CATEGORY_PK_COLUMN = "CATEGORY";
    public static final String LANG_PK_COLUMN = "LANG";

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setLang(String lang) {
        writeProperty(LANG_PROPERTY, lang);
    }
    public String getLang() {
        return (String)readProperty(LANG_PROPERTY);
    }

    public void setText(String text) {
        writeProperty(TEXT_PROPERTY, text);
    }
    public String getText() {
        return (String)readProperty(TEXT_PROPERTY);
    }

    public void setCategory(MCRCategory category) {
        setToOneTarget(CATEGORY_PROPERTY, category, true);
    }

    public MCRCategory getCategory() {
        return (MCRCategory)readProperty(CATEGORY_PROPERTY);
    }


}
