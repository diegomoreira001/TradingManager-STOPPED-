package com.dmoreira.fintech.domains.mappers;

import com.dmoreira.fintech.domains.Bond;
import com.dmoreira.fintech.domains.Stock;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego.moreira on 11/8/2016.
 */
public class HtmlBondMapper {

    public List<Bond> unmarshall(String html) {

        List<Bond> bonds = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        Element table = doc.getElementById("ctl00_contentFORM_Panel_dgrPanel");
        if (table == null) {
            throw new RuntimeException("");
        }

        boolean first = true;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        DecimalFormat format = new DecimalFormat();
        format.setDecimalFormatSymbols(symbols);
        for (Element row : table.select("tr")) {
            if (!first) {
                first = false;
                Bond bond = new Bond();
                Elements tds = row.select("td");
                try {
                    bond.setTicker(tds.get(0).text()); //Tickr

                    bond.setDue(tds.get(1).text()); //Due
                    bond.setState(tds.get(2).text()); //State
                    bond.setMisc(tds.get(3).text()); //Marca Ex

                    bond.setBidQty(Integer.valueOf(tds.get(4).text()));
                    bond.setBid(format.parse(tds.get(5).text()).floatValue());
                    bond.setAskQty(Integer.valueOf(tds.get(6).text()));
                    bond.setAsk(format.parse(tds.get(7).text()).floatValue());
                    bond.setLastPrice(format.parse(tds.get(8).text()).floatValue());
                    bond.setTrend(tds.get(9).text());

                    bond.setChange(format.parse(tds.get(10).text()).floatValue());
                    bond.setHigh(format.parse(tds.get(11).text()).floatValue());
                    bond.setLow(format.parse(tds.get(12).text()).floatValue());
                    bond.setLastClose(format.parse(tds.get(13).text()).floatValue());
                    bond.setTotalVolume(Long.valueOf(tds.get(14).text()));
                    bond.setTotalCashVolume(Long.valueOf(tds.get(15).text()));

                    bond.setLastQty(Integer.valueOf(tds.get(16).text()));

                    bond.setLastTime(new SimpleDateFormat("hh:mm:ss").parse(tds.get(17).text()));
                } catch (Exception e) {

                }

                bonds.add(bond);
            } else {
                first = false;
            }
        }

        return bonds;
    }


}
