/*  -------------------------------------------------- **/
/*  Generated by Enterprise Architect Version 8.0.858**/
/*  Created On : 星期日, 08 三月, 2015 **/
/*  DBMS       : MySql **/
/*  -------------------------------------------------- **/

USE stock
;


/* Drop Tables, Stored Procedures and Views **/

DROP TABLE IF EXISTS T_SAO_STOCK_MONEY_ROUTE_INFO
;
DROP TABLE IF EXISTS T_SAO_MARKET_STOCK_INFO_REAL_TIME
;
DROP TABLE IF EXISTS T_SAO_MARKET_STOCK_INFO_DAY_STATICS
;
DROP TABLE IF EXISTS T_SAO_STOCK_INFO
;

/* Create Tables **/
CREATE TABLE T_SAO_STOCK_MONEY_ROUTE_INFO
(
	stock_code INTEGER NOT NULL,
	main_money_in DOUBLE DEFAULT 0 COMMENT '主力净流入',
	main_money_in_rate DOUBLE,
	ext_big_money_in DOUBLE,
	ext_big_money_in_rate DOUBLE,
	big_money_in DOUBLE,
	big_money_in_rate DOUBLE,
	medium_money_in DOUBLE,
	medium_money_in_rate DOUBLE,
	small_money_in DOUBLE,
	small_money_in_rate DOUBLE,
	exchange_ext_big_money_in DOUBLE,
	exchange_ext_big_money_out DOUBLE,
	exchange_big_money_in DOUBLE,
	exchange_big_money_out DOUBLE,
	exchange_medium_money_in DOUBLE,
	exchange_medium_money_out DOUBLE,
	exchange_small_money_in DOUBLE,
	exchange_small_money_out DOUBLE,
	update_time DATETIME NOT NULL,
	PRIMARY KEY (stock_code, update_time)
) 
;


CREATE TABLE T_SAO_MARKET_STOCK_INFO_REAL_TIME
(
	stock_code INTEGER NOT NULL COMMENT '股票代码',
	today_first_price DOUBLE DEFAULT 0,
	yesterday_price DOUBLE DEFAULT 0,
	top_price DOUBLE DEFAULT 0,
	low_price DOUBLE DEFAULT 0,
	current_price DOUBLE DEFAULT 0 COMMENT '实时价格',
	buy_mount DOUBLE DEFAULT 0,
	sale_mount DOUBLE DEFAULT 0,
	weibi DOUBLE DEFAULT 0,
	weicha DOUBLE DEFAULT 0,
	exchange_mount INTEGER DEFAULT 0 COMMENT '成交量',
	stock_change_scale DOUBLE DEFAULT 0 COMMENT '换手',
	inter_mount DOUBLE DEFAULT 0 COMMENT '内盘',
	outter_mount DOUBLE DEFAULT 0 COMMENT '外盘',
	n1st_buy_mount DOUBLE DEFAULT 0,
	n1st_buy_price DOUBLE DEFAULT 0,
	n2st_buy_mount DOUBLE DEFAULT 0,
	n2st_buy_price DOUBLE DEFAULT 0,
	n3st_buy_mount DOUBLE DEFAULT 0,
	n3st_buy_price DOUBLE DEFAULT 0,
	n4st_buy_mount DOUBLE DEFAULT 0,
	n4st_buy_price DOUBLE DEFAULT 0,
	n5st_buy_mount DOUBLE DEFAULT 0,
	n5st_buy_price DOUBLE DEFAULT 0,
	n1st_sale_mount DOUBLE DEFAULT 0,
	n1st_sale_price DOUBLE DEFAULT 0,
	n2st_sale_mount DOUBLE DEFAULT 0,
	n2st_sale_price DOUBLE DEFAULT 0,
	n3st_sale_mount DOUBLE DEFAULT 0,
	n3st_sale_price DOUBLE DEFAULT 0,
	n4st_sale_mount DOUBLE DEFAULT 0,
	n4st_sale_price DOUBLE DEFAULT 0,
	n5st_sale_mount DOUBLE DEFAULT 0,
	n5st_sale_price DOUBLE DEFAULT 0,
	update_time DATETIME NOT NULL,
	PRIMARY KEY (stock_code, update_time)
)  COMMENT='股价实时信息表，有价格变化时入库'
;


CREATE TABLE T_SAO_MARKET_STOCK_INFO_DAY_STATICS
(
	stock_code INTEGER NOT NULL COMMENT '股票代码',
	current_price DOUBLE DEFAULT 0 COMMENT '实时价格',
	yesterday_price DOUBLE DEFAULT 0 COMMENT '昨收价格',
	start_market_price DOUBLE DEFAULT 0 COMMENT '开盘价格',
	stop_market_price DOUBLE DEFAULT 0 COMMENT '收盘价格',
	lowest_price DOUBLE NOT NULL DEFAULT 0 COMMENT '最低价格',
	top_price DOUBLE NOT NULL DEFAULT 0 COMMENT '最高价格',
	mount_scale DOUBLE DEFAULT 0 COMMENT '量比',
	exchange_mount DOUBLE DEFAULT 0 COMMENT ' 成交量',
	stock_change_scale DOUBLE NOT NULL DEFAULT 0 COMMENT '股票换手情况',
	update_time DATETIME NOT NULL COMMENT '更新时间',
	PRIMARY KEY (stock_code)
)  COMMENT='股票日信息表'
;


CREATE TABLE T_SAO_STOCK_INFO
(
	stock_code INTEGER NOT NULL COMMENT '股票代码',
	stock_name NVARCHAR(200) COMMENT '股票名称',
	area VARCHAR(50),
	trade VARCHAR(50) COMMENT '行业',
	PE DOUBLE DEFAULT 0,
	PA DOUBLE DEFAULT 0,
	PB DOUBLE DEFAULT 0,
	column1 VARCHAR(50),
	column2 VARCHAR(50),
	column3 VARCHAR(50),
	column4 VARCHAR(50),
	PRIMARY KEY (stock_code),
	UNIQUE UQ_T_SAO_STOCK_INFO_stock_name(stock_name)
)  COMMENT='股票信息表'
;
