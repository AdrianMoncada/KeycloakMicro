db.createUser(
    {
        user: "usrmongo",
        pwd: "pwdmongo",
        roles: [
            {
                role: "readWrite",
                db: "moviesmongo"
            }
        ]
    }
);
