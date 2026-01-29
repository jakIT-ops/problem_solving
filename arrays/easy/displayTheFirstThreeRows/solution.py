import pandas as pd


def selectFirstRows(employees: pd.DataFrame, n: int = 3) -> pd.DataFrame:
    return employees.head(n)
