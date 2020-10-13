package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.Glossary;
import seedu.address.model.ReadOnlyGlossary;
import seedu.address.model.flashcard.EnglishPhrase;
import seedu.address.model.flashcard.FlashCard;
import seedu.address.model.flashcard.GermanPhrase;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code Glossary} with sample data.
 */
public class SampleDataUtil {
    public static FlashCard[] getSampleFlashCards() {
        return new FlashCard[] {
            new FlashCard(new GermanPhrase("Alex Yeoh"), new EnglishPhrase("englishphrase"),
                    getTagSet("friends")),
            new FlashCard(new GermanPhrase("Bernice Yu"), new EnglishPhrase("englishphrase"),
                    getTagSet("colleagues", "friends")),
            new FlashCard(new GermanPhrase("Charlotte Oliveiro"), new EnglishPhrase("englishphrase"),
                    getTagSet("neighbours")),
            new FlashCard(new GermanPhrase("David Li"), new EnglishPhrase("englishphrase"),
                    getTagSet("family")),
            new FlashCard(new GermanPhrase("Irfan Ibrahim"), new EnglishPhrase("englishphrase"),
                    getTagSet("classmates")),
            new FlashCard(new GermanPhrase("Roy Balakrishnan"), new EnglishPhrase("englishphrase"),
                    getTagSet("colleagues"))
        };
    }

    public static ReadOnlyGlossary getSampleGlossary() {
        Glossary sampleG = new Glossary();
        for (FlashCard sampleFlashCard : getSampleFlashCards()) {
            sampleG.addPerson(sampleFlashCard);
        }
        return sampleG;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
