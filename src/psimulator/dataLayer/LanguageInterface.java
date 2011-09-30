package psimulator.dataLayer;

import java.util.Observer;

/**
 *
 * @author Martin
 */
public interface LanguageInterface {
    public void setCurrentLanguage(int languagePosition);
    public Object[] getAvaiableLanguageNames();
    public int getCurrentLanguagePosition();
    public String getString(String string);
    
    public void addLanguageObserver(Observer observer);
}
