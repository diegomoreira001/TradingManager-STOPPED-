package com.dmoreira.fintech.domains.mappers;

import com.dmoreira.fintech.domains.Stock;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by diego.moreira on 11/8/2016.
 */
public class HtmlStockMapper {

    public List<Stock> unmarshall(String html) {

        List<Stock> stocks = new ArrayList<>();
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
                Stock stock = new Stock();
                Elements tds = row.select("td");
                try {
                    stock.setTicker(tds.get(0).text()); //Tickr

                    stock.setDue(tds.get(1).text()); //Due
                    stock.setState(tds.get(2).text()); //State
                    stock.setMisc(tds.get(3).text()); //Marca Ex

                    stock.setBidQty(Integer.valueOf(tds.get(4).text()));
                    stock.setBid(format.parse(tds.get(5).text()).floatValue());
                    stock.setAskQty(Integer.valueOf(tds.get(6).text()));
                    stock.setAsk(format.parse(tds.get(7).text()).floatValue());
                    stock.setLastPrice(format.parse(tds.get(8).text()).floatValue());
                    stock.setTrend(tds.get(9).text());

                    stock.setChange(format.parse(tds.get(10).text()).floatValue());
                    stock.setHigh(format.parse(tds.get(11).text()).floatValue());
                    stock.setLow(format.parse(tds.get(12).text()).floatValue());
                    stock.setLastClose(format.parse(tds.get(13).text()).floatValue());
                    stock.setTotalVolume(Long.valueOf(tds.get(14).text()));
                    stock.setTotalCashVolume(Long.valueOf(tds.get(15).text()));

                    stock.setLastQty(Integer.valueOf(tds.get(16).text()));

                    stock.setLastTime(new SimpleDateFormat("hh:mm:ss").parse(tds.get(17).text()));
                } catch (Exception e) {

                }

                stocks.add(stock);
            } else {
                first = false;
            }
        }

        return stocks;
    }


}
