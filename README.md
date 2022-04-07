Currency checker
===
This repository contains a source code of Crypto checker application.
### Description
This repository contains the source code of the program for obtaining cryptocurrency rates from the site coinmarketcap.com by API.

### CoinMarketCap
https://coinmarketcap.com
### CoinMarketCap API
https://coinmarketcap.com/api/


Content
---

* [Parse JSON](#Build)
* [Build](#Build)
    - [_Idea IDE_](#Idea)
    - [_Console Maven_](#Maven)
* [Configuration](#Configuration)


Parse JSON<a name="Parse JSON" />
 - Попробуем получить ответ сервера содержащий сет данных в формате JSON

- вот такой ответ сервера
``````
{"status":{"timestamp":"2022-04-06T08:01:08.253Z","error_code":0,"error_message":null,"elapsed":29,"credit_count":1,"notice":null},"data":{"ADA":[{"id":2010,"name":"Cardano","symbol":"ADA","slug":"cardano","num_market_pairs":419,"date_added":"2017-10-01T00:00:00.000Z","tags":[{"slug":"mineable","name":"Mineable","category":"OTHER"},{"slug":"dpos","name":"DPoS","category":"CONSENSUS_ALGORITHM"},{"slug":"pos","name":"PoS","category":"CONSENSUS_ALGORITHM"},{"slug":"platform","name":"Platform","category":"PROPERTY"},{"slug":"research","name":"Research","category":"PROPERTY"},{"slug":"smart-contracts","name":"Smart Contracts","category":"PROPERTY"},{"slug":"staking","name":"Staking","category":"PROPERTY"},{"slug":"cardano-ecosystem","name":"Cardano Ecosystem","category":"PROPERTY"},{"slug":"cardano","name":"Cardano","category":"PROPERTY"},{"slug":"bnb-chain","name":"BNB Chain","category":"PROPERTY"}],"max_supply":45000000000,"circulating_supply":33739028515.755,"total_supply":34277702081.605,"is_active":1,"platform":null,"cmc_rank":9,"is_fiat":0,"self_reported_circulating_supply":null,"self_reported_market_cap":null,"last_updated":"2022-04-06T07:59:00.000Z","quote":{"RUB":{"price":95.98774676086087,"volume_24h":117133164168.73558,"volume_change_24h":-34.423,"percent_change_1h":-0.96498545,"percent_change_24h":-5.52327909,"percent_change_7d":-5.51646672,"percent_change_30d":41.46870936,"percent_change_60d":-0.79803299,"percent_change_90d":-6.44660288,"market_cap":3238533325127.755,"market_cap_dominance":1.8452,"fully_diluted_market_cap":4319448604239.081,"last_updated":"2022-04-06T08:00:13.000Z"}}}]}}
``````
- Сгенерируем Java класс с полями соответствующими ответу сервера.

Generate Plain Old Java Objects from JSON or JSON-Schema. jsonschema2pojo
https://www.jsonschema2pojo.org/

Build<a name="Build" />
### _Idea IDE_<a name="Idea" />


### _Console Maven_<a name="Maven" />

Configuration<a name="Configuration" />