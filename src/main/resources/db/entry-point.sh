#!/bin/bash
# Run Microsoft SQl Server and initialization script (at the same time)
/usr/src/app/init-db.sh & /opt/mssql/bin/sqlservr