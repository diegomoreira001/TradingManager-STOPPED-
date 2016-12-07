package com.dmoreira.fintech;

import com.dmoreira.fintech.domains.Stock;
import com.dmoreira.fintech.domains.mappers.HtmlStockMapper;
import org.junit.Test;

import java.util.List;

/**
 * Created by diego.moreira on 11/8/2016.
 */
public class HtmlStockMapperTest {

    @Test
    public void testUnmarshall() throws Exception {

        HtmlStockMapper mapper = new HtmlStockMapper();

        List<Stock> stocks = mapper.unmarshall(sample);
    }

    String sample = "<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\"/>\n" +
            "<!DOCTYPE html >\n" +
            "\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\" >\n" +
            "<head><title>\n" +
            "\n" +
            "</title>\n" +
            "    <link href=\"../App_Themes/BolsarCss/BolsarCss.css\" type=\"text/css\" rel=\"stylesheet\" /></head>\n" +
            "<body>\n" +
            "    <form name=\"aspnetForm\" method=\"post\" action=\"WQAccionesLideres.aspx\" id=\"aspnetForm\">\n" +
            "<div>\n" +
            "<input type=\"hidden\" name=\"__VIEWSTATE\" id=\"__VIEWSTATE\" value=\"r7C60qt0z10q6vMNzyQVTNP2cuaPI4/UPw7GM8bCqyTVm7wawWf9EcUE1sXiSFmf5Eyc+gIUVX5fjyOaoqnffG0WENI=\" />\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "\n" +
            "\t<input type=\"hidden\" name=\"__VIEWSTATEGENERATOR\" id=\"__VIEWSTATEGENERATOR\" value=\"F7548C65\" />\n" +
            "\t<input type=\"hidden\" name=\"__VIEWSTATEENCRYPTED\" id=\"__VIEWSTATEENCRYPTED\" value=\"\" />\n" +
            "</div>\n" +
            "    <div>\n" +
            "        \n" +
            "<table cellspacing=\"0\" rules=\"all\" border=\"1\" id=\"ctl00_contentFORM_Panel_dgrPanel\" style=\"border-collapse:collapse;\">\n" +
            "\t<tr>\n" +
            "\t\t<td>Especie</td><td>Vencimiento</td><td>Estado</td><td>Marca EX</td><td>Cantidad Nominal Compra</td><td>Precio Compra</td><td>Cantidad Nominal Venta</td><td>Precio Venta</td><td>Último</td><td>Tendencia</td><td>Variación %</td><td>Máximo</td><td>Mínimo</td><td>Cierre Ant.</td><td>Vol. Nominal</td><td>Monto Operado ($)</td><td>Cant. Ope.</td><td>Hora Cotización</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>AGRO</td><td>Cdo</td><td></td><td></td><td>0</td><td>0,000</td><td>0</td><td>0,000</td><td>25,250</td><td>=</td><td>1,00</td><td>25,300</td><td>24,500</td><td>25,000</td><td>440</td><td>11048</td><td>4</td><td>15:15:18</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>AGRO</td><td>72</td><td></td><td></td><td>4019</td><td>24,700</td><td>146</td><td>24,750</td><td>24,750</td><td>=</td><td>1,02</td><td>26,000</td><td>24,700</td><td>24,500</td><td>80501</td><td>2023153</td><td>170</td><td>16:59:48</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>ALUA</td><td>Cdo</td><td></td><td></td><td>10000</td><td>9,650</td><td>2111</td><td>15,000</td><td>9,750</td><td>=</td><td>0,52</td><td>9,750</td><td>9,650</td><td>9,700</td><td>15151</td><td>146912</td><td>4</td><td>15:50:28</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>ALUA</td><td>24</td><td></td><td></td><td>2050</td><td>9,660</td><td>3591</td><td>9,750</td><td>9,750</td><td>-</td><td>1,04</td><td>9,800</td><td>9,750</td><td>9,650</td><td>7539</td><td>73673</td><td>5</td><td>15:59:30</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>ALUA</td><td>72</td><td></td><td></td><td>8600</td><td>9,760</td><td>49147</td><td>9,800</td><td>9,800</td><td>=</td><td>2,08</td><td>10,000</td><td>9,710</td><td>9,600</td><td>627894</td><td>6148231</td><td>235</td><td>16:58:52</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>APBR</td><td>Cdo</td><td></td><td></td><td>8</td><td>84,200</td><td>0</td><td>0,000</td><td>84,200</td><td>=</td><td>5,51</td><td>84,700</td><td>83,000</td><td>79,800</td><td>56511</td><td>4733236</td><td>65</td><td>15:58:07</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>APBR</td><td>24</td><td></td><td></td><td>3700</td><td>84,600</td><td>1301</td><td>85,400</td><td>84,900</td><td>=</td><td>6,13</td><td>84,900</td><td>84,000</td><td>80,000</td><td>19900</td><td>1678151</td><td>18</td><td>16:30:25</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>APBR</td><td>72</td><td></td><td></td><td>10110</td><td>85,500</td><td>9310</td><td>85,600</td><td>85,600</td><td>+</td><td>6,67</td><td>85,600</td><td>83,000</td><td>80,250</td><td>602969</td><td>50876531</td><td>666</td><td>16:59:48</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>BMA</td><td>Cdo</td><td></td><td></td><td>175</td><td>114,150</td><td>0</td><td>0,000</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>BMA</td><td>24</td><td></td><td></td><td>0</td><td>0,000</td><td>180</td><td>115,000</td><td>114,500</td><td>=</td><td>0,44</td><td>114,500</td><td>114,500</td><td>114,000</td><td>100</td><td>11450</td><td>2</td><td>16:11:11</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>BMA</td><td>72</td><td></td><td></td><td>46</td><td>114,000</td><td>195</td><td>114,200</td><td>114,200</td><td>+</td><td>1,51</td><td>118,000</td><td>113,500</td><td>112,500</td><td>55722</td><td>6378996</td><td>185</td><td>16:59:57</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CARC</td><td>Cdo</td><td></td><td></td><td>0</td><td>0,000</td><td>0</td><td>0,000</td><td>4,100</td><td>=</td><td>10,22</td><td>4,100</td><td>4,100</td><td>3,720</td><td>8100</td><td>33210</td><td>5</td><td>13:54:35</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CARC</td><td>24</td><td></td><td></td><td>5000</td><td>4,000</td><td>0</td><td>0,000</td><td>4,160</td><td>=</td><td>2,72</td><td>4,160</td><td>4,040</td><td>4,050</td><td>13000</td><td>53040</td><td>5</td><td>14:36:15</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CARC</td><td>72</td><td></td><td></td><td>10572</td><td>4,130</td><td>5494</td><td>4,150</td><td>4,150</td><td>+</td><td>5,87</td><td>4,200</td><td>3,980</td><td>3,920</td><td>565709</td><td>2317271</td><td>211</td><td>16:58:45</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CECO2</td><td>Cdo</td><td></td><td></td><td>5000</td><td>10,800</td><td>0</td><td>0,000</td><td>11,400</td><td>+</td><td>5,56</td><td>11,400</td><td>11,000</td><td>10,800</td><td>500</td><td>5620</td><td>2</td><td>13:45:55</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CECO2</td><td>24</td><td></td><td></td><td>800</td><td>10,800</td><td>5900</td><td>11,300</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CECO2</td><td>72</td><td></td><td></td><td>4721</td><td>10,850</td><td>3061</td><td>11,000</td><td>11,000</td><td>=</td><td>2,80</td><td>11,350</td><td>10,950</td><td>10,700</td><td>319717</td><td>3539104</td><td>168</td><td>16:57:16</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CELU</td><td>Cdo</td><td></td><td></td><td>250</td><td>21,600</td><td>0</td><td>0,000</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CELU</td><td>72</td><td></td><td></td><td>180</td><td>21,500</td><td>564</td><td>21,550</td><td>21,550</td><td>-</td><td>0,47</td><td>22,250</td><td>21,300</td><td>21,450</td><td>139893</td><td>3023625</td><td>150</td><td>16:59:33</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CEPU</td><td>24</td><td></td><td></td><td>115</td><td>173,000</td><td>0</td><td>0,000</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CEPU</td><td>72</td><td></td><td></td><td>5163</td><td>174,000</td><td>150</td><td>176,000</td><td>176,000</td><td>+</td><td>2,92</td><td>176,000</td><td>174,000</td><td>171,000</td><td>22533</td><td>3934599</td><td>86</td><td>16:40:25</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>COME</td><td>Cdo</td><td></td><td></td><td>300</td><td>3,200</td><td>3000</td><td>3,230</td><td>3,210</td><td>=</td><td>2,23</td><td>3,220</td><td>3,150</td><td>3,140</td><td>88700</td><td>281595</td><td>15</td><td>15:38:37</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>COME</td><td>24</td><td></td><td></td><td>65000</td><td>3,200</td><td>0</td><td>0,000</td><td>3,240</td><td>=</td><td>1,89</td><td>3,240</td><td>3,170</td><td>3,180</td><td>74010</td><td>235227</td><td>14</td><td>16:49:47</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>COME</td><td>72</td><td></td><td></td><td>12720</td><td>3,250</td><td>83280</td><td>3,260</td><td>3,260</td><td>+</td><td>4,15</td><td>3,260</td><td>3,150</td><td>3,130</td><td>2911470</td><td>9311429</td><td>350</td><td>16:59:53</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CRES</td><td>Cdo</td><td></td><td></td><td>0</td><td>0,000</td><td>15</td><td>24,950</td><td>24,950</td><td>-</td><td>1,22</td><td>25,200</td><td>24,950</td><td>24,650</td><td>10462</td><td>261808</td><td>8</td><td>15:53:49</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CRES</td><td>24</td><td></td><td></td><td>1500</td><td>25,000</td><td>1875</td><td>25,450</td><td>25,100</td><td>-</td><td>-1,57</td><td>25,450</td><td>25,100</td><td>25,500</td><td>925</td><td>23261</td><td>2</td><td>16:09:47</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CRES</td><td>72</td><td></td><td></td><td>4538</td><td>25,350</td><td>9429</td><td>25,400</td><td>25,400</td><td>=</td><td>2,63</td><td>25,450</td><td>24,850</td><td>24,750</td><td>846525</td><td>21291163</td><td>380</td><td>16:59:54</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CTIO</td><td>Cdo</td><td></td><td></td><td>0</td><td>0,000</td><td>0</td><td>0,000</td><td>39,250</td><td>+</td><td>1,16</td><td>39,250</td><td>39,000</td><td>38,800</td><td>1095</td><td>42958</td><td>2</td><td>15:21:08</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CTIO</td><td>24</td><td></td><td></td><td>256</td><td>39,000</td><td>0</td><td>0,000</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>CTIO</td><td>72</td><td></td><td></td><td>9223</td><td>39,800</td><td>1000</td><td>39,950</td><td>39,900</td><td>=</td><td>3,10</td><td>40,000</td><td>38,000</td><td>38,700</td><td>75438</td><td>2951394</td><td>152</td><td>17:00:04</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>EDN</td><td>Cdo</td><td></td><td></td><td>7463</td><td>19,000</td><td>7463</td><td>19,900</td><td>19,900</td><td>=</td><td>3,11</td><td>19,900</td><td>19,800</td><td>19,300</td><td>7863</td><td>156433</td><td>3</td><td>15:28:11</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>EDN</td><td>24</td><td></td><td></td><td>732</td><td>19,700</td><td>1000</td><td>19,800</td><td>19,700</td><td>=</td><td>3,68</td><td>19,700</td><td>19,700</td><td>19,000</td><td>600</td><td>11820</td><td>2</td><td>15:17:19</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>EDN</td><td>72</td><td></td><td></td><td>155</td><td>19,650</td><td>1498</td><td>19,700</td><td>19,650</td><td>-</td><td>1,55</td><td>19,900</td><td>19,350</td><td>19,350</td><td>252124</td><td>4971807</td><td>180</td><td>16:57:06</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>ERAR</td><td>Cdo</td><td></td><td></td><td>10000</td><td>9,040</td><td>1450</td><td>9,170</td><td>9,120</td><td>=</td><td>-1,51</td><td>9,300</td><td>9,120</td><td>9,260</td><td>17983</td><td>165924</td><td>12</td><td>14:58:24</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>ERAR</td><td>24</td><td></td><td></td><td>1500</td><td>8,810</td><td>0</td><td>0,000</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>ERAR</td><td>72</td><td></td><td></td><td>20430</td><td>9,130</td><td>7300</td><td>9,140</td><td>9,140</td><td>=</td><td>0,00</td><td>9,350</td><td>9,110</td><td>9,140</td><td>2094852</td><td>19288816</td><td>567</td><td>16:59:52</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>FRAN</td><td>Cdo</td><td></td><td></td><td>0</td><td>0,000</td><td>0</td><td>0,000</td><td>97,200</td><td>+</td><td>2,97</td><td>97,500</td><td>97,000</td><td>94,400</td><td>4156</td><td>404663</td><td>6</td><td>14:32:33</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>FRAN</td><td>72</td><td></td><td></td><td>1254</td><td>97,600</td><td>520</td><td>97,800</td><td>97,700</td><td>=</td><td>2,20</td><td>100,000</td><td>96,500</td><td>95,600</td><td>89399</td><td>8745388</td><td>283</td><td>16:59:41</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>GGAL</td><td>Cdo</td><td></td><td></td><td>2000</td><td>45,000</td><td>1000</td><td>46,050</td><td>45,800</td><td>=</td><td>2,46</td><td>46,100</td><td>45,550</td><td>44,700</td><td>81645</td><td>3754457</td><td>22</td><td>15:26:33</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>GGAL</td><td>24</td><td></td><td></td><td>50</td><td>46,000</td><td>2500</td><td>46,300</td><td>46,150</td><td>=</td><td>2,21</td><td>46,150</td><td>45,000</td><td>45,150</td><td>7188</td><td>330423</td><td>9</td><td>16:58:24</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>GGAL</td><td>72</td><td></td><td></td><td>6666</td><td>46,400</td><td>644</td><td>46,500</td><td>46,400</td><td>-</td><td>3,57</td><td>46,900</td><td>45,500</td><td>44,800</td><td>359272</td><td>16533626</td><td>306</td><td>16:59:59</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>JMIN</td><td>Cdo</td><td></td><td></td><td>2160</td><td>31,200</td><td>6000</td><td>32,000</td><td>31,600</td><td>=</td><td>1,94</td><td>31,600</td><td>31,500</td><td>31,000</td><td>3000</td><td>94750</td><td>3</td><td>14:23:06</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>JMIN</td><td>24</td><td></td><td></td><td>0</td><td>0,000</td><td>550</td><td>33,500</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>JMIN</td><td>72</td><td></td><td></td><td>1171</td><td>31,750</td><td>5449</td><td>31,800</td><td>31,750</td><td>+</td><td>2,42</td><td>32,000</td><td>31,200</td><td>31,000</td><td>190439</td><td>6030710</td><td>232</td><td>16:59:16</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>MIRG</td><td>Cdo</td><td></td><td></td><td>140</td><td>415,000</td><td>1</td><td>420,000</td><td>420,000</td><td>-</td><td>1,94</td><td>429,000</td><td>416,000</td><td>412,000</td><td>960</td><td>404371</td><td>9</td><td>15:57:31</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>MIRG</td><td>24</td><td></td><td></td><td>0</td><td>0,000</td><td>21</td><td>429,000</td><td>425,000</td><td>=</td><td>0,00</td><td>425,000</td><td>425,000</td><td>425,000</td><td>579</td><td>245947</td><td>3</td><td>12:17:30</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>MIRG</td><td>72</td><td></td><td></td><td>5</td><td>431,000</td><td>150</td><td>433,000</td><td>434,000</td><td>+</td><td>2,84</td><td>434,000</td><td>422,050</td><td>422,000</td><td>12775</td><td>5463860</td><td>254</td><td>16:58:55</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>PAMP</td><td>Cdo</td><td></td><td></td><td>0</td><td>0,000</td><td>0</td><td>0,000</td><td>20,600</td><td>+</td><td>1,98</td><td>21,000</td><td>20,500</td><td>20,200</td><td>65730</td><td>1356505</td><td>9</td><td>15:43:22</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>PAMP</td><td>24</td><td></td><td></td><td>950</td><td>20,600</td><td>255</td><td>20,700</td><td>20,650</td><td>=</td><td>2,48</td><td>20,650</td><td>20,650</td><td>20,150</td><td>500</td><td>10325</td><td>2</td><td>15:27:45</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>PAMP</td><td>72</td><td></td><td></td><td>2367</td><td>20,650</td><td>29619</td><td>20,700</td><td>20,700</td><td>=</td><td>2,48</td><td>20,800</td><td>20,350</td><td>20,200</td><td>1976267</td><td>40772196</td><td>415</td><td>16:59:53</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>SAMI</td><td>Cdo</td><td></td><td></td><td>170</td><td>117,500</td><td>0</td><td>0,000</td><td>118,000</td><td>-</td><td>2,61</td><td>118,750</td><td>118,000</td><td>115,000</td><td>330</td><td>39017</td><td>7</td><td>14:13:28</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>SAMI</td><td>72</td><td></td><td></td><td>460</td><td>118,000</td><td>1041</td><td>118,500</td><td>118,500</td><td>+</td><td>1,37</td><td>122,000</td><td>117,300</td><td>116,900</td><td>35516</td><td>4203113</td><td>160</td><td>16:58:51</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>TECO2</td><td>Cdo</td><td></td><td></td><td>60</td><td>56,100</td><td>14000</td><td>56,500</td><td>56,500</td><td>=</td><td>0,44</td><td>56,500</td><td>56,500</td><td>56,250</td><td>40</td><td>2260</td><td>1</td><td>12:00:44</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>TECO2</td><td>72</td><td></td><td></td><td>1804</td><td>56,000</td><td>2146</td><td>56,350</td><td>56,350</td><td>+</td><td>0,63</td><td>58,950</td><td>56,000</td><td>56,000</td><td>28308</td><td>1599318</td><td>56</td><td>16:59:46</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>TRAN</td><td>Cdo</td><td></td><td></td><td>0</td><td>0,000</td><td>1000</td><td>11,100</td><td>11,100</td><td>=</td><td>5,71</td><td>11,100</td><td>11,100</td><td>10,500</td><td>380</td><td>4218</td><td>1</td><td>12:49:39</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>TRAN</td><td>24</td><td></td><td></td><td>1800</td><td>11,050</td><td>3500</td><td>11,100</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>TRAN</td><td>72</td><td></td><td></td><td>138</td><td>10,950</td><td>18144</td><td>11,000</td><td>10,950</td><td>-</td><td>1,39</td><td>11,300</td><td>10,900</td><td>10,800</td><td>353017</td><td>3915725</td><td>187</td><td>16:59:52</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>TS</td><td>Cdo</td><td></td><td></td><td>0</td><td>0,000</td><td>714</td><td>216,000</td><td>212,000</td><td>-</td><td>-1,85</td><td>216,000</td><td>212,000</td><td>216,000</td><td>187</td><td>39704</td><td>2</td><td>15:45:06</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>TS</td><td>24</td><td></td><td></td><td>0</td><td>0,000</td><td>5</td><td>216,000</td><td>216,000</td><td>=</td><td>-0,46</td><td>216,000</td><td>216,000</td><td>217,000</td><td>245</td><td>52920</td><td>1</td><td>13:47:52</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>TS</td><td>72</td><td></td><td></td><td>161</td><td>216,100</td><td>141</td><td>219,000</td><td>219,000</td><td>+</td><td>1,39</td><td>219,500</td><td>215,000</td><td>216,000</td><td>39552</td><td>8576311</td><td>151</td><td>16:59:40</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>YPFD</td><td>Cdo</td><td></td><td></td><td>50</td><td>251,000</td><td>124</td><td>253,000</td><td>252,500</td><td>-</td><td>0,70</td><td>257,500</td><td>252,000</td><td>250,750</td><td>2629</td><td>668725</td><td>31</td><td>15:53:11</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>YPFD</td><td>24</td><td></td><td></td><td>193</td><td>253,000</td><td>300</td><td>255,000</td><td>253,000</td><td>=</td><td>0,80</td><td>256,300</td><td>253,000</td><td>251,000</td><td>1319</td><td>335246</td><td>5</td><td>16:30:45</td>\n" +
            "\t</tr><tr>\n" +
            "\t\t<td>YPFD</td><td>72</td><td></td><td></td><td>1499</td><td>255,000</td><td>1222</td><td>255,200</td><td>255,200</td><td>=</td><td>1,07</td><td>260,000</td><td>252,500</td><td>252,500</td><td>207974</td><td>53103242</td><td>571</td><td>16:59:56</td>\n" +
            "\t</tr>\n" +
            "</table>\n" +
            "\n" +
            "\n" +
            "\n" +
            "    </div>\n" +
            "    </form>\n" +
            "</body>\n" +
            "</html>\n";

}