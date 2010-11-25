My Events
=========

Basic Java project implemented by following the excellent
[Learning Java tutorial](http://splinter.com.au/blog/?p=194) by Chris Hulbert.

Technologies
------------
* [Sitemesh](http://www.opensymphony.com/sitemesh/) 2.4
* [JSTL](http://www.oracle.com/technetwork/java/index-jsp-135995.html) 1.2
* [Apache Struts](http://http://struts.apache.org/) 2.2
* [Spring Framework](http://www.springsource.org/) 3.0
* [Hibernate](http://www.hibernate.org/) 3.6
* [Apache Log4j](http://logging.apache.org/log4j/) 1.2
    * [SLF4J](http://www.slf4j.org/) 1.6
    * [Apache Commons Logging](http://commons.apache.org/logging/) 1.1
* [MySQL](http://www.mysql.com/)

MySQL 5.1, Tomcat 7 and Eclipse Java EE Helios was used during development.

Installation
------------
* Create a database named "events"
* Configure `src/hibernate.cfg.xml` with the username and password for the database
* Import data.sql into the events database
        mysql -u root events < src/bootstrap.sql
* Open the project in Eclipse and start the server
