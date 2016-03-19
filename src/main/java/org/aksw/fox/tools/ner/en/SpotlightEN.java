package org.aksw.fox.tools.ner.en;

import java.io.IOException;
import java.util.Locale;

import org.aksw.fox.tools.ner.common.SpotlightCommon;
import org.aksw.fox.utils.FoxCfg;
import org.aksw.fox.utils.FoxConst;
import org.apache.log4j.PropertyConfigurator;

public class SpotlightEN extends SpotlightCommon {

  public SpotlightEN() {
    super(Locale.ENGLISH);
  }

  public static void main(final String[] a) throws IOException {
    PropertyConfigurator.configure(FoxCfg.LOG_FILE);

    // final TrainingInputReader tr = new TrainingInputReader();
    // tr.initFiles("input/4");

    new SpotlightEN()
        .retrieve(//
            FoxConst.NER_EN_EXAMPLE_1.concat(FoxConst.NER_EN_EXAMPLE_2))//
        .forEach(LOG::info);

  }
}
