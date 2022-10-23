package bussiness.personsmanage;

import dataAccess.IDBService;
import logger.ILoggerService;

public class PersonManager implements IPersonService {


    IDBService idbService;
    ILoggerService iLoggerService;

    public PersonManager(ILoggerService iLoggerService) {
        this.iLoggerService = iLoggerService;
    }

    public PersonManager(IDBService idbService) {
        this.idbService = idbService;
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void read() {

    }
}
